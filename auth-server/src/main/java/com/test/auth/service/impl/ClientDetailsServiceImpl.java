package com.test.auth.service.impl;

import com.test.auth.entity.OauthClientDetails;
import com.test.auth.repository.OauthClientDetailsMapper;
import com.test.auth.service.IClientDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author chenhj
 */
@Slf4j
@Service
public class ClientDetailsServiceImpl implements IClientDetailsService {


    @Autowired
    private OauthClientDetailsMapper oauthClientDetailsMapper;

    @Override
    public OauthClientDetails findByClientId(String clientId) {
        log.info("OauthClientDetails-start");
        OauthClientDetails clientDetails =new OauthClientDetails();
        clientDetails.setClientId(clientId);
        List<OauthClientDetails> list = oauthClientDetailsMapper.selectList(clientDetails);
        log.info("OauthClientDetails-end");
        return list.isEmpty()? null:list.get(0);
    }

    @Override
    public List<OauthClientDetails> findAll(OauthClientDetails clientDetails) {
        List<OauthClientDetails> list = oauthClientDetailsMapper.selectList(clientDetails);
        return list;
    }
}
