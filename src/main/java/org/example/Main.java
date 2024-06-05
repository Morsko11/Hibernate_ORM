package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Person.class).configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

     /*   Query query = session.createQuery("INSERT INTO Person (name,age,gender)"+" select name ,age , gender from  Person ");
        query.setParameter("name","OLEG");
        query.setParameter("age",4444);
        query.setParameter("gender",Gender.MALE);
        query.executeUpdate();*/

        //System.out.println( session.get(Person.class,1).toString());
       // System.out.println( session.load(Person.class,2).toString());
/*
        Query fromPerson = session.createQuery("update Person set name =: name, age =:age ,gender =:gender where id=:id");
        fromPerson.setParameter("name","name");
        fromPerson.setParameter("age",52);
        fromPerson.setParameter("gender",Gender.FEMALE);
        fromPerson.setParameter("id",1);
        fromPerson.executeUpdate();
       */
     /*   Person person = session.get(Person.class, 1);
        person.setAge(23);
        person.setName("W24");
        person.setGender(Gender.MALE);

        session.detach(person);
        Person merge =(Person) session.merge(person);
        session.save(merge);
        // session.saveOrUpdate(person);
       */
        session.getTransaction().commit();


    }
}