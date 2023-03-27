package com.itqiankun.mockito.service;

import com.itqiankun.mockito.dao.User;
import com.itqiankun.mockito.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


/**
 * @author: ma_qiankun
 * @date: 2023/3/27
 **/
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    public UserMapper userMapper;
    @InjectMocks
    public UserServiceImpl userService;

    @Test
    public void shorthand(){
        User t = new User();
        t.setName("tom");
        Mockito.when(userMapper.getUser(Mockito.any())).thenReturn(t);
        User user = userService.getUser(1L);
        System.out.println(user);
    }
}