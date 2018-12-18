package com.xy.bootssm.service;

import com.xy.bootssm.pojo.SysUser;

/**
 * @author xyLonely
 * @date 2018/12/18 9:37
 */
public interface UserService {

    public SysUser login(String username);
}
