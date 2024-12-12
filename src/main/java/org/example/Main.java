package org.example;

import org.example.model.User;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Create
        session.beginTransaction();
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        session.save(user);
        session.getTransaction().commit();

        // Read
        User fetchedUser = session.get(User.class, 1);
        System.out.println("Fetched User: " + fetchedUser.getName());

        // Update
        session.beginTransaction();
        fetchedUser.setEmail("updated.email@example.com");
        session.update(fetchedUser);
        session.getTransaction().commit();

        // Delete
        session.beginTransaction();
        session.delete(fetchedUser);
        session.getTransaction().commit();

        session.close();
    }
}

/* Note: You must close one transaction before opening another. Hibernate sessions only allow
* one transaction at a time */