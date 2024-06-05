package One_To_Many;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Owner")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name ="age")
    private int age;
    @Column(name = "adress")
    private String adress;
    @OneToMany(mappedBy = "owner",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Pet> pet_List;
}
