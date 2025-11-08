package OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address_3")
public class Address {

    @Id
    private  int id;
    private String  AddressType;
    private  String Address;

    @ManyToOne
    private Empdetls empdetls;

    public Address(int id, String address, String addressType) {
        this.id = id;
        Address = address;
        AddressType = addressType;
    }
    public Address() { } // required by Hibernate

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    public String getAddess() {
        return Address;
    }

    public void setAddess(String addess) {
        Address = addess;
    }
}
