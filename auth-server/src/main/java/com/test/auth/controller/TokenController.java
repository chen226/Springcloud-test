package com.test.auth.controller;

import com.chj.common.exception.BusinessException;
import com.chj.common.sys.GpResponse;
import com.test.auth.vo.SysUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.endpoint.CheckTokenEndpoint;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/oauth",produces = "application/json; charset=UTF-8")
public class TokenController {

    @Autowired
    @Qualifier("checkTokenEndpoint")
    private CheckTokenEndpoint checkTokenEndpoint;
    @Autowired
    private TokenEndpoint tokenEndpoint;

    @Autowired
    private TokenStore tokenStore;
    @Autowired
    private ClientDetailsService clientDetailsService;
    @PostMapping("/login")
    public GpResponse token(@RequestBody SysUserVo u) {
        GpResponse gpResponse=new GpResponse();
        try {
            log.info("token  start ......");
            Map parameters=new HashMap();
            parameters.put("grant_type","password");
            parameters.put("username",u.getUsername());
            parameters.put("password",u.getPassword());
            Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            Authentication authentication = new UsernamePasswordAuthenticationToken("test", "test",grantedAuthorities);
            ResponseEntity<OAuth2AccessToken> responseEntity= tokenEndpoint.postAccessToken(authentication ,parameters);
            gpResponse.setData(responseEntity.getBody());
            log.info("token  end ......");
        }catch (BusinessException b){
            gpResponse.setResult(false,b.getMessage());
        }catch (Exception e){
            gpResponse.setResult(false,e.getMessage());
        }
        return gpResponse;
    }

}
