package org.example.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();


        context.close();
    }
}

