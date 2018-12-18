package com.xy.bootssm.dao;

import com.xy.bootssm.pojo.SysUser;
import org.springframework.stereotype.Component;

import java.util.List;
@Component(value = "sysUserMapper")
public interface SysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}