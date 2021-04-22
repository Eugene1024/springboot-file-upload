package com.github.eugene1024.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;


/**
 * @author : dylanz
 * @since : 11/02/2020
 */
//@Configuration
public class MultipartConfig {
    //@Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory multipartConfigFactory = new MultipartConfigFactory();

        multipartConfigFactory.setMaxFileSize(DataSize.parse("10240MB"));
        multipartConfigFactory.setMaxRequestSize(DataSize.parse("10240MB"));

        return multipartConfigFactory.createMultipartConfig();
    }
}
