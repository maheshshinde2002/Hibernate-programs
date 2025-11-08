package OneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "Empdetls_2")
public class Empdetls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name ;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "a_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
}
