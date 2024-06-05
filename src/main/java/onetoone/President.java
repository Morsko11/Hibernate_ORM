package onetoone;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "President")
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Country_Id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Country country;

    public President(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public President() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "President{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country.getName() +
                '}';
    }
}
