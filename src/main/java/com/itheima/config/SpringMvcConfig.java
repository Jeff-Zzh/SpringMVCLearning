package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3.创建SpringMVC配置文件，加载controller对应的bean
@Configuration
//包扫描，要扫到对应的类组件
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {
}
