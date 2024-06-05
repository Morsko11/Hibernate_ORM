package onetoone;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
/* Все операции
найти всех президентов
найти по имени
обновить какого то президента
удалить страну
добавить страну

 */
@Entity
@Table(name = "Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Population")
    private int population;
    @Enumerated(EnumType.STRING)
    @Column(name = "Type")
    private Type type;

    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private President president;

    public Country(String name, int population, Type type) {
        this.name = name;
        this.population = population;
        this.type = type;

    }

    public Country() {

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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", type=" + type +
                ", president=" + president +
                '}';
    }
}
