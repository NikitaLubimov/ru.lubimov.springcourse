package org.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.example.hibernate.entity.Employee;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp1 = new Employee("Nikita", "Lybimov", "It", 100000);
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
