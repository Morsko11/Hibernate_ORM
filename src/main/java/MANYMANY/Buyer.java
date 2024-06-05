package MANYMANY;

import Many_to_Many.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Buyer")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column (name = "age")
    private int age;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="Autor_Books",joinColumns = @JoinColumn(name = "Autor_Id"),inverseJoinColumns =@JoinColumn(name = "Book_id"))
    private List<Book> book_list;
}
