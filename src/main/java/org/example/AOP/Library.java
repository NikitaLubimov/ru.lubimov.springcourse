package org.example.AOP;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Пользовать взял книгу");
    }

    public void getMagazine() {
        System.out.println("Пользовать взял журнал");
    }

    public void addBook () {
        System.out.println("Пользовать добавил книгу ");
    }

    public void retunBook() {
        System.out.println("Пользователь вернул книгу");
    }
}
