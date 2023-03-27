package com.itqiankun.mockito.dao;

import org.springframework.stereotype.Component;

/**
 * @author: ma_qiankun
 * @date: 2023/3/27
 **/
@Component
public class UserMapperImpl implements UserMapper{
    @Override
    public User getUser(Long userId) {
        User user = new User();
        user.setName("tom");
        return user;
    }
}
