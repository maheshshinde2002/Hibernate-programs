package LazyAndEagerLoading;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address1 {

    @Id
    private int id;
    private String addressType;
    private String address;

    public Address1() {
    }

    public Address1(int id, String addressType, String address) {
        this.id = id;
        this.addressType = addressType;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

