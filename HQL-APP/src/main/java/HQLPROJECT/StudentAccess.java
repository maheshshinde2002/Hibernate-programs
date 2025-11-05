package HQLPROJECT;


import jakarta.persistence.*;

@Entity
@Table(name = "Student_Access")
public class StudentAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id1;
    private String name1;
    private String address1;
//
//    public StudentAccess(int id1, String name1, String address1) {
//        this.id1 = id1;
//        this.name1 = name1;
//        this.address1 = address1;
//    }


    @Override
    public String toString() {
        return "StudentAccess{" +
                "id1=" + id1 +
                ", name1='" + name1 + '\'' +
                ", address1='" + address1 + '\'' +
                '}';
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}
