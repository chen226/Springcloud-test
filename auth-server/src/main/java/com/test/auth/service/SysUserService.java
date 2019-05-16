package com.test.auth.service;

import com.test.auth.vo.SysUserVo;

public interface SysUserService {
    SysUserVo findUserByUserName(String username);
}
