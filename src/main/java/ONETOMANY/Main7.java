package ONETOMANY;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
/*

Основные операции двумя способами
Создать связь many_many
Основные операции



 */
public class Main7 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(People.class).addAnnotatedClass(Car.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
       /* People people = new People();
        people.setName("Victor");
        people.setStazh(13);
        Car car = new Car();
        car.setCar_type(Car_type.MINIVEN);
        car.setName("ASdasd");
        car.setPower(144);
        car.setPeople(people);
        Car car2 = new Car();
        car2.setCar_type(Car_type.SPORTCAR);
        car2.setName("OPERESA");
        car2.setPower(655);
        car2.setPeople(people);
        List<Car> cars = List.of(car,car2);
        people.setCarList(cars);
        session.save(people);*/



        session.getTransaction().commit();
    }
}
