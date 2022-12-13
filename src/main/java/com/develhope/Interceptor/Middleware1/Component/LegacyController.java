package com.develhope.Interceptor.Middleware1.Component;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "legacy")
public class LegacyController implements HandlerInterceptor {

    @GetMapping(value= "")
    public String massage(){
        return "This is an old message";
    }


}
