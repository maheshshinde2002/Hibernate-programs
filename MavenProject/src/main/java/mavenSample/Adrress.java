package mavenSample;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="studentDetails")
public class Adrress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private  int addressId;

    @Column(length = 50,name = "STREET")
    private  String street;

    @Column(length = 100,name = "CITY")
    private String city;

    @Column(name = "Is_Open")
    private  boolean isOpen;

    @Transient
    private  double x;

    @Column(name = "added_type")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    public Adrress(int addressId, String street, String city, boolean isOpen, double x, Date addedDate) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
    }


    public Adrress() {
        super();
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "Adrress{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                '}';
    }
}
