package com.itqiankun.mockito.service;

import com.itqiankun.mockito.dao.User;
import com.itqiankun.mockito.dao.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: ma_qiankun
 * @date: 2023/3/27
 **/
@Component
public class UserServiceImpl implements UserService{
    @Resource
    public UserMapper userMapper;
    @Override
    public User getUser(Long userId) {
        return userMapper.getUser(userId);
    }
}
