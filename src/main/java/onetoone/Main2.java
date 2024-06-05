package onetoone;

import org.example.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/* Все операции
найти всех президентов
найти по имени
обновить какого то президента
удалить страну
добавить страну

 */
public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(President.class).addAnnotatedClass(Country.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

      /*  Country country = new Country("Russia",424244,Type.KNITH);
        President president = new President("Putin",42,country);
        country.setPresident(president);
        Country country1 = new Country("USA",1223452,Type.MONARX);
        President president1 = new President("Obama",32,country1);
        country.setPresident(president1);
        Country country2 = new Country("KZ",4213212,Type.RESPUBLICA);
        President president2 = new President("Nazarbaev",55,country2);
        country.setPresident(president2);
        Country country3 = new Country("Ukraina",123456,Type.RESPUBLICA);
        President president3 = new President("Zelensk",67,country3);
        country.setPresident(president3);
        Country country4 = new Country("OAE",521343,Type.KNITH);
        President president4 = new President("Orasfs",87,country4);
        country.setPresident(president4);*/

       /* Query<President> query = session.createQuery("FROM President ", President.class);

        List<President> list = query.list();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }*/
     /*   Query query2 = session.createQuery("update President set name=:name, age=:age where  id =: id");
        query2.setParameter("name","name");
        query2.setParameter("age",52);
        query2.setParameter("id", 1);
        query2.executeUpdate();*/
       /* Country country = session.get(Country.class, 1);
        session.delete(country);*/

    /*    Query query4 = session.createQuery("INSERT INTO Country ");
        query3.setParameter("id", 1);
        query3.executeUpdate();
        //("update Person set name =: name, age =:age ,gender =:gender where id=:id");
*/

        session.getTransaction().commit();
    }
}
