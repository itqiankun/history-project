package com.itqiankun.mockito.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: ma_qiankun
 * @date: 2023/3/27
 **/
public interface UserMapper {

    public User getUser(Long userId);
}
