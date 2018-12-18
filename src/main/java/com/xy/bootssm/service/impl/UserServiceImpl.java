package com.xy.bootssm.service.impl;

import com.xy.bootssm.dao.SysUserMapper;
import com.xy.bootssm.pojo.SysUser;
import com.xy.bootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xyLonely
 * @date 2018/12/18 9:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String username) {

        return sysUserMapper.selectByPrimaryKey(1l);
    }
}
