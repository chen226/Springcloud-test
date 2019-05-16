package com.test.auth.controller;

import com.test.auth.vo.SysUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequestMapping(value = "/userAuth",produces = "application/json; charset=UTF-8")
public class UserAuthController {

    /**
     * 各个服务获取验证授权用户信息的接口
     * @param user
     * @return
     */
    @GetMapping("/userInfo")
    public SysUserVo userInfo(Principal user){
        log.info("得到用户信息---start,user={}",user);
        OAuth2Authentication oAuth2Authentication = (OAuth2Authentication) user;
        log.info("得到用户信息---end");
        return (SysUserVo)oAuth2Authentication.getUserAuthentication().getPrincipal();
    }
    /**
     * 各个服务获取验证授权用户信息的接口
     * @param user
     * @return
     */
    @GetMapping("/oAuth2Authentication")
    public Principal oAuth2Authentication(Principal user){
        log.info("得到用户信息---start,user={}",user);
        log.info("得到用户信息---end");
        return user;
    }
}
