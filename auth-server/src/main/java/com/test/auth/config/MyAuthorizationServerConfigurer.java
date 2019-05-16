package com.test.auth.config;

import com.test.auth.Handler.MyAccessDeniedHandler;
import com.test.auth.Handler.MyAuthenticationEntryPoint;
import com.test.auth.security.SecurityClientDetailsServiceImpl;
import com.test.auth.security.SecurityUserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.AbstractPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***/
@Configuration
@EnableAuthorizationServer
public class MyAuthorizationServerConfigurer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;


    /**
     * Configure the security of the Authorization Server, which means in practical terms the /oauth/token endpoint. The
     * /oauth/authorize endpoint also needs to be secure, but that is a normal user-facing endpoint and should be
     * secured the same way as the rest of your UI, so is not covered here. The default settings cover the most common
     * requirements, following recommendations from the OAuth2 spec, so you don't need to do anything here to get a
     * basic server up and running.
     *
     * @param security a fluent configurer for security features
     *
     * 定义令牌端点上的安全方式
     * */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

        security
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
        //*AccessDeineHandler 用来解决认证过的用户访问无权限资源时的异常*//*
        //*AuthenticationEntryPoint 用来解决匿名用户访问无权限资源时的异常*//*
        security.accessDeniedHandler(myAccessDeniedHandler());
        security.authenticationEntryPoint(myAuthenticationEntryPoint());
       /* *//*加过滤器*//*
        security.addTokenEndpointAuthenticationFilter(null);
        *//*允许请求url添加参数*//*
        security.allowFormAuthenticationForClients();
        security.authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED));
        *//**ssl校验*//*
        security.sslOnly();
        *//**配置自己的加密方式*//*
        security.passwordEncoder(new AbstractPasswordEncoder() {
            @Override
            protected byte[] encode(CharSequence rawPassword, byte[] salt) {
                return new byte[0];
            }
        });
        *//**设置安全领域
        * 默认为"oauth2/client"
         * *//*
        security.realm("oauth2/client");
        security.tokenKeyAccess("permitAll()");
        *//*允许范围*//*
        security.checkTokenAccess("");*/
        super.configure(security);
    }/**
     * Configure the {@link ClientDetailsService}, e.g. declaring individual clients and their properties. Note that
     * password grant is not enabled (even if some clients are allowed it) unless an {@link AuthenticationManager} is
     * supplied to the {@link #configure(AuthorizationServerEndpointsConfigurer)}. At least one client, or a fully
     * formed custom {@link ClientDetailsService} must be declared or the server will not start.
     *
     * @param clients the client details configurer
     * 定义客户端详细信息服务的配置器。
     * 可以初始化客户端详细信息，也可以只引用现有资源
     * */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(new SecurityClientDetailsServiceImpl());
        super.configure(clients);
    }
    /**
     * Configure the non-security features of the Authorization Server endpoints, like token store, token
     * customizations, user approvals and grant types. You shouldn't need to do anything by default, unless you need
     * password grants, in which case you need to provide an {@link AuthenticationManager}.
     *
     * @param endpoints the endpoints configurer
     *
     * *定义授权和令牌端点以及令牌服务*/
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore());
        endpoints.authenticationManager(authenticationManager);
        endpoints.userDetailsService(new SecurityUserDetailsServiceImpl());
        endpoints.setClientDetailsService(new SecurityClientDetailsServiceImpl());
        super.configure(endpoints);
    }
    @Bean
    public TokenStore tokenStore(){
        InMemoryTokenStore tokenStore = new InMemoryTokenStore();
        return tokenStore;
    }
    @Bean
    public MyAccessDeniedHandler myAccessDeniedHandler(){
        return new MyAccessDeniedHandler();
    }
    @Bean
    public MyAuthenticationEntryPoint myAuthenticationEntryPoint(){
        return new MyAuthenticationEntryPoint();
    }

}
