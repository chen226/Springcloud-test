package com.test.auth.service;



import com.test.auth.entity.OauthClientDetails;

import java.util.List;

public interface IClientDetailsService {

    public OauthClientDetails findByClientId(String clientId) ;

    public List<OauthClientDetails> findAll(OauthClientDetails clientDetails);
}
