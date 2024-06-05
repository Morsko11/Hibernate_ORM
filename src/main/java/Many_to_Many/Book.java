package Many_to_Many;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Book")
@Getter
@Setter
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "book_type")
    @Enumerated(EnumType.STRING)
    private Book_Type bookType;
    @ManyToMany(mappedBy = "book_list",cascade ={ CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Autor> autor_list;
}
