package ONETOMANY;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Table(name = "People")
@Setter
@Getter
@Entity
@NoArgsConstructor
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "stazh")
    private int Stazh;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "people",fetch = FetchType.EAGER)
    private List<Car> carList;
}
