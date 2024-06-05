package Many_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Autor.class).addAnnotatedClass(Book.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Book book = new Book();
        book.setName("EXPEREMENT");
        book.setBookType(Book_Type.ROMAN);
        Book book1 = new Book();
        book1.setName("EXPEREMENT2");
        book1.setBookType(Book_Type.ROMAN);
        Book book2 = new Book();
        book2.setName("EXPEREMENT3");
        book2.setBookType(Book_Type.ROMAN);
        List<Book> books = List.of(book,book1,book2);

      Book book3 = new Book();
        book3.setName("Divnee_Utro");
        book3.setBookType(Book_Type.FANTASY);
        Book book4 = new Book();
        book4.setName("Ya_Vas_Lubil");
        book4.setBookType(Book_Type.FANTASY);
       List<Book> books1 = List.of(book3,book4);

        Book book5 = new Book();
        book5.setName("Bratua_Karamazavi");
        book5.setBookType(Book_Type.FANTASY);
        Book book6 = new Book();
        book6.setName("Bednie_Ludi");
        book6.setBookType(Book_Type.FANTASY);
        Book book7 = new Book();
        book7.setName("Besi");
        book7.setBookType(Book_Type.FANTASY);
        List<Book> books2 = List.of(book5,book6,book7);

        Autor autor = new Autor();
        autor.setName("AUTOR");
        autor.setAge(555);
        autor.setBook_list(books);

      Autor autor1 = new Autor();
        autor1.setName("Pushkin");
        autor1.setAge(67);
        autor1.setBook_list(books1);


        Autor autor2 = new Autor();
        autor2.setName("Dostoevskii");
        autor2.setAge(32);
        autor2.setBook_list(books2);

        List<Autor> autors = List.of(autor);
       List<Autor> autors1= List.of(autor1);
        List<Autor> autors2 = List.of(autor2);

      book.setAutor_list(autors);
      book1.setAutor_list(autors);
      book2.setAutor_list(autors);
   book3.setAutor_list(autors1);
      book4.setAutor_list(autors1);
      book5.setAutor_list(autors2);
      book6.setAutor_list(autors2);
      book7.setAutor_list(autors2);
      session.save(autor1);
      session.save(autor2);
           session.save(autor);













        session.getTransaction().commit();
    }
}
