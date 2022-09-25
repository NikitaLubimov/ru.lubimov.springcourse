package org.example.AOP.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(* org.example.AOP.Library.get* ())")
    private void allGetMethodsFromLibrary() {
    }

    @Pointcut("execution(* org.example.AOP.Library.add* ())")
    private void allAddMethodsFromLibrary (){
    }

    @Pointcut("allGetMethodsFromLibrary() || allAddMethodsFromLibrary ()")
    private void allGetMethodsAndAllAddMethodsFromLibrary(){

    }

//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: попытка получить метарил");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: попытка авторизации пользователя");
//    }

}
