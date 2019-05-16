package com.test.auth.security;

import com.test.auth.entity.OauthClientDetails;
import com.test.auth.service.IClientDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


/**
 * @author chenhj
 * @version V1.0
 * @Description: oauth客户端实现
 * @date 2018/1/16.
 */
@Service
public class SecurityClientDetailsServiceImpl implements ClientDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(SecurityClientDetailsServiceImpl.class);
    @Autowired
    private IClientDetailsService clientDetailsService;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        logger.info("clientDetailsDO  info : start----" +clientId);
        OauthClientDetails clientDetailsDO = clientDetailsService.findByClientId(clientId);
        String resourceIds = clientDetailsDO.getResourceIds();
        String scopes = clientDetailsDO.getScope();
        String grantTypes = clientDetailsDO.getAuthorizedGrantTypes();
        String authorities = clientDetailsDO.getAuthorities();
        String redirectUris = clientDetailsDO.getWebServerRedirectUri();
        Integer refreshTokenValiditySeconds = clientDetailsDO.getRefreshTokenValiditySeconds();
        Integer accessTokenValiditySeconds = clientDetailsDO.getAccessTokenValiditySeconds();
        String clientSecret=clientDetailsDO.getClientSecret();
        logger.info("clientDetailsDO={} ",clientDetailsDO);
        BaseClientDetails baseClientDetails = new BaseClientDetails(clientId,resourceIds,scopes,grantTypes,authorities,redirectUris);
        baseClientDetails.setRefreshTokenValiditySeconds(refreshTokenValiditySeconds);
        baseClientDetails.setAccessTokenValiditySeconds(accessTokenValiditySeconds);
        baseClientDetails.setClientSecret(clientSecret);
        baseClientDetails.setClientId(clientId);
        logger.info("clientDetailsDO  info : end" );
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        if(clientDetailsDO.getAuthorities()==null){
            grantedAuthorities.add(new SimpleGrantedAuthority("server"));
        }else{
            String[] auth=clientDetailsDO.getAuthorities().split(",");
            for(int i=0;i<auth.length;i++){
                grantedAuthorities.add(new SimpleGrantedAuthority(auth[i]));
            }
        }
        baseClientDetails.setAuthorities(grantedAuthorities);
//        try {
//            Authentication authentication= new UsernamePasswordAuthenticationToken();
//
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }catch (Exception e){
//            Authentication authentication= new UsernamePasswordAuthenticationToken(clientId, clientSecret, grantedAuthorities);
//
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }
        return baseClientDetails;
    }
}
