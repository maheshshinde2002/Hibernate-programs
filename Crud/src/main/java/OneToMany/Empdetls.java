package OneToMany;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.util.List;

@Entity
@Table(name = "empdels_3")
public class Empdetls {

    @Id
    private int id;
    private  String name ;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "empdetls")
    private List<Address> address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
