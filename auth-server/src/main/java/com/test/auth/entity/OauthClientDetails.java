package com.test.auth.entity;

import lombok.Data;

@Data
public class OauthClientDetails {
    /**
     * ID
     */
    private Long id;

    /**
     * 
     */
    private String clientId;

    /**
     * 
     */
    private String resourceIds;

    /**
     * 
     */
    private String clientSecret;

    /**
     * 
     */
    private String scope;

    /**
     * 
     */
    private String authorizedGrantTypes;

    /**
     * 
     */
    private String webServerRedirectUri;

    /**
     * 
     */
    private String authorities;

    /**
     * 
     */
    private Integer accessTokenValiditySeconds;

    /**
     * 
     */
    private Integer refreshTokenValiditySeconds;

    /**
     * 
     */
    private String additionalInformation;

    /**
     * 
     */
    private String autoapprove;

}