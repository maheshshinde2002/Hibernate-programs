package OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
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
