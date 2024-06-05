package One_To_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.persistence.criteria.From;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/*
Создать 2 класса
Соединить их one to one
Many to one
и все задачи
посчтиать возраста
среднее арифметическое
поиск по первой букве имени
поиск макс мин
*/


public class Main3 {
    static SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Owner.class).addAnnotatedClass(Pet.class).configure("hibernate.cfg.xml").buildSessionFactory();

    public static void main(String[] args) {


        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();




      /*  Pet pet = new Pet("Malish", 12, Breed.CHIHUA);
        Pet pet1 = new Pet("Tom", 1, Breed.MALTEZE);
        Pet pet2 = new Pet("Volod", 8, Breed.OVCHARKA);
        List<Pet> pet3 = List.of(pet, pet1, pet2);


        Owner owner = new Owner();
        owner.setName("Ilua");
        owner.setAge(44);
        owner.setAdress("Pristasds");
        owner.setPet_List(pet3);
        pet.setOwner(owner);
        pet1.setOwner(owner);
        pet2.setOwner(owner);
        session.save(owner);


        Pet pets = new Pet("Oweasd", 32, Breed.OVCHARKA);
        Pet pets1 = new Pet("afsfsa", 4, Breed.OVCHARKA);
        Pet pets2 = new Pet("asdsad", 5, Breed.SIBIRSKAY);
        List<Pet> pets3 = List.of(pets, pets1, pets2);


        Owner owner1 = new Owner();
        owner1.setName("Valera");
        owner1.setAge(25);
        owner1.setAdress("GASfsafcsa");
        owner1.setPet_List(pets3);
        pets.setOwner(owner1);
        pets1.setOwner(owner1);
        pets2.setOwner(owner1);
        session.save(owner1);
        session.getTransaction().commit();*/

      /*  Query query = session.createQuery("FROM Owner WHERE name=: name");
        query.setParameter("name","Ilua");
        System.out.println(query.list());*/

      /*  Query query = session.createQuery("UPDATE Pet set name=:name WHERE breed=:breed");
        query.setParameter("name","Vasua");
        query.setParameter("breed",Breed.MALTEZE);
        query.executeUpdate();*/
       /* Query query = session.createQuery("FROM Pet  order by name ");
               List list = query.list();
        System.out.println(list);*/

       /* Owner owner = session.get(Owner.class, 1);
        List<Pet> petList = owner.getPet_List();
        petList.sort((x, y)-> x.getName().compareTo(y.getName()));
        System.out.println(petList);*/

      /*  Pet pet = session.get(Pet.class, 7);
session.delete(pet);*/

      /*  Query query = session.createQuery("FROM Owner WHERE age<=:age");
        query.setParameter("age", 32);
        System.out.println(query.list());*/

       /* Query query = session.createQuery("FROM Pet where name Like : a  ");
          query.setParameter("a", "a%");
          System.out.println(query.list());*/

        Query<Owner> query = session.createQuery("FROM  Owner",Owner.class);
        List<Owner> list = query.list();
        Pattern pattern = Pattern.compile("\\d+");

        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = pattern.matcher(list.get(i).getAdress());
           while (matcher.find()){
               System.out.println(matcher.group());
           }
        }
       // System.out.println(query.list());


        session.getTransaction().commit();

    }


}
