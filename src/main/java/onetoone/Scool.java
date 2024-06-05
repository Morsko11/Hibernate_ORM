package onetoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "Scool")
@Setter
@Getter
@NoArgsConstructor
public class Scool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private int number;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "director_id")
    private Director director;

    @Override
    public String toString() {
        return "Scool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", director=" + director.getName() +
                '}';
    }
}
