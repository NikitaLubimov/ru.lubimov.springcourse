package org.example.AOP;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.AOP")
@EnableAspectJAutoProxy
public class MySpringConfig {
}
