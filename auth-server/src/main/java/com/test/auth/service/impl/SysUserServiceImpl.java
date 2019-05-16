package com.test.auth.service.impl;

import com.chj.common.utils.BeanMapper;
import com.test.auth.repository.SysUserMapper;
import com.test.auth.service.SysUserService;
import com.test.auth.vo.SysUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenhj
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUserVo findUserByUserName(String username) {
        return BeanMapper.map(sysUserMapper.findUserByUserName(username),SysUserVo.class);
    }
}
