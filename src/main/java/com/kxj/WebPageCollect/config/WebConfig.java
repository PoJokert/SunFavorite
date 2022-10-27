package com.kxj.WebPageCollect.config;

import com.kxj.WebPageCollect.interceptor.AutoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @Author WQL-KXJ
 * @ProjectName WebPageCollect
 * @PackageName com.kxj.WebPageCollect.config
 * @Date 2022/10/27 15:44
 * @Version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AutoInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**","/js/**","/images/**","/layui/**");
    }
}
