package LazyAndEagerLoading;

import OneToMany.Address;
import OneToMany.Empdetls;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

    public class HibernateUtil {

        private static SessionFactory sessionFactory;

        static {
            try {
                Configuration configuration = new Configuration();
                configuration.configure("hibernate.cfg.xml");

                // 👇 Add your annotated entity classes manually
                configuration.addAnnotatedClass(Address1.class);
                configuration.addAnnotatedClass(Employee1.class);

                sessionFactory = configuration.buildSessionFactory();

            } catch (Throwable ex) {
                System.err.println("SessionFactory creation failed: " + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shutdown() {
            getSessionFactory().close();
        }
    }

