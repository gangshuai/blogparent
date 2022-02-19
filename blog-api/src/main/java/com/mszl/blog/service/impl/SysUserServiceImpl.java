package com.mszl.blog.service.impl;

import com.mszl.blog.dao.mapper.SysUserMapper;
import com.mszl.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public String findUserById(Long authorId) {
        return sysUserMapper.selectById(authorId).getNickname();
    }
}
