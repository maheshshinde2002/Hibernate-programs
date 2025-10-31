package OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private  int id;
    private String  AddressType;
    private  String Address;


    public Address(int id, String address, String addressType) {
        this.id = id;
        Address = address;
        AddressType = addressType;
    }

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
