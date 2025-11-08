package OneToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "Address_2")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
 private  String Addess;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddess() {
        return Addess;
    }

    public void setAddess(String addess) {
        Addess = addess;
    }
}
