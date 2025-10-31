package DemoProgram;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_data")
public class EmployeeData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name", length = 100, nullable = false)
    private String empName;

    @Column(name = "emp_department", length = 50)
    private String department;

    @Column(name = "emp_salary")
    private double salary;

    @Temporal(TemporalType.DATE)
    @Column(name = "joining_date")
    private Date joiningDate;

    @Transient
    private double bonusAmount;

    public EmployeeData() {
        super();
    }

    public EmployeeData(int empId, String empName, String department, double salary, Date joiningDate, double bonusAmount) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.bonusAmount = bonusAmount;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                ", bonusAmount=" + bonusAmount +
                '}';
    }
}
