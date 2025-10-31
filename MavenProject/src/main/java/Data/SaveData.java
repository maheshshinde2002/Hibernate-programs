package Data;

import mavenSample.Adrress;
import mavenSample.HibernateUtil;
import mavenSample.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class SaveData {
    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = null;
                transaction = session.beginTransaction();
                Student student = new Student();
                student.setId(102);
                student.setName("Rahul");
                student.setAge(20);
                session.persist(student);
                transaction.commit();

                System.out.println(" Data saved successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        }

