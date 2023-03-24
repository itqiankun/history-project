package com.itqiankun.web;

import com.itqiankun.entity.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ma_qiankun
 * @date: 2023/3/24
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        Entity entity = new Entity();
        return entity.test();
    }
}
