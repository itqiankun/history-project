package com.itqiankun.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${server.port}")
    private String port;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public String get() {
        return port;
    }
}