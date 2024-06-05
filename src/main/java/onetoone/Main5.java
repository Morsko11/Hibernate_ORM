package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Director.class).addAnnotatedClass(Scool.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
     Director director = new Director();
     /*   director.setName("Igor");
        director.setAge(445);
        Scool scool = new Scool();
        scool.setName("IgorScoll");
        scool.setNumber(5555);
        scool.setDirector(director);
        director.setScool(scool);
        session.save(director);*/

     /*   Query query = session.createQuery("UPDATE Scool set number=:number where name=:name");
        query.setParameter("number",54);
        query.setParameter("name","Licei");
        query.executeUpdate();*/

        Scool scool = session.get(Scool.class, 3);
        session.delete(scool);


        session.getTransaction().commit();
    }
}
