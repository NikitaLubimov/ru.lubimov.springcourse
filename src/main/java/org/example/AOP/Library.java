package org.example.AOP;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Пользовать вхял книгу");
    }
}
