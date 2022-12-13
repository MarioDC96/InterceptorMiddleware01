package com.develhope.Interceptor.Middleware1.Configurations;

import com.develhope.Interceptor.Middleware1.Component.BasicController;
import com.develhope.Interceptor.Middleware1.Component.LegacyController;
import com.develhope.Interceptor.Middleware1.Interceptor.BasicInterceptor;
import com.develhope.Interceptor.Middleware1.Interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private BasicInterceptor basicInterceptor;
    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(basicInterceptor);
        registry.addInterceptor(legacyInterceptor);

    }
}
