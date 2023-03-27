package com.itqiankun.mockito.service;

import com.itqiankun.mockito.dao.User;

/**
 * @author: ma_qiankun
 * @date: 2023/3/27
 **/
public interface UserService {
    public User getUser(Long userId);
}
