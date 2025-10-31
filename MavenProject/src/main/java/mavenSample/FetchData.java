package mavenSample;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchData {


    public static void main(String[] args) {
        //get  , load
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory f=cfg.buildSessionFactory();
        Session s=f.openSession();
        //get-student:3
        Adrress s1 = s.getReference(Adrress.class, 1);
        Adrress s2 = s.getReference(Adrress.class, 5);

        // Adrress s1 = s.get(Adrress.class, 1);
        // Adrress s2 = s.get(Adrress.class, 5);
        
        System.out.println(s1);
        System.out.println(s2);

        f.close();
         s.close();
    }
}
