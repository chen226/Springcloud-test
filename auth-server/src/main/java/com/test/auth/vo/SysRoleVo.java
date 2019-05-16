package com.test.auth.vo;

import lombok.Data;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.core.GrantedAuthority;

import java.util.Date;

@Data
public class SysRoleVo implements GrantedAuthority {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String roleName;

    /**
     * 用户编号（作为用户登录的账号）
     */
    private String roleCode;

    /**
     * 所属组织
     */
    private Long groupId;

    /**
     * 是否可用,1表示可用，0表示不可用
     */
    private Boolean enabled;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private String sys;

    /**
     * If the <code>GrantedAuthority</code> can be represented as a <code>String</code>
     * and that <code>String</code> is sufficient in precision to be relied upon for an
     * access control decision by an {@link AccessDecisionManager} (or delegate), this
     * method should return such a <code>String</code>.
     * <p>
     * If the <code>GrantedAuthority</code> cannot be expressed with sufficient precision
     * as a <code>String</code>, <code>null</code> should be returned. Returning
     * <code>null</code> will require an <code>AccessDecisionManager</code> (or delegate)
     * to specifically support the <code>GrantedAuthority</code> implementation, so
     * returning <code>null</code> should be avoided unless actually required.
     *
     * @return a representation of the granted authority (or <code>null</code> if the
     * granted authority cannot be expressed as a <code>String</code> with sufficient
     * precision).
     */
    @Override
    public String getAuthority() {
        return roleCode;
    }
}