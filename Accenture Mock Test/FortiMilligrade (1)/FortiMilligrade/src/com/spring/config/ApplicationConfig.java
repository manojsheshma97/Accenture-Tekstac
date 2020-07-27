package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// use appropriate annotations
@Configuration
@ComponentScan({"com.spring.bo","com.spring.model","com.spring.service"})
public class ApplicationConfig
{

}
