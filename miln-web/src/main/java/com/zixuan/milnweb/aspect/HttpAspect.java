package com.zixuan.milnweb.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HttpAspect {
    @Before("execution(public * controller.UserController.GetUserInfo(..))")
    public  void log(){
        System.out.println("拦截前");
    }
}
