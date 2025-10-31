package LazyAndEagerLoading;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Employee1 {
        @Id
        private int id;
        private String name;

        @OneToMany(fetch = FetchType.LAZY)            //FetchType.LAZY
        @JoinColumn(name = "emp_id") // foreign key column in Address table
        private List<Address1> address;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<Address1> getAddress() {
            return address;
        }

        public void setAddress(List<Address1> address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

