package mavenSample;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

    public class HibernateUtil {

        private static SessionFactory sessionFactory;

        static {
            try {
                // Build SessionFactory from hibernate.cfg.xml
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("SessionFactory creation failed: " + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }

        // 👇 This is YOUR custom method
        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }

        public static void shutdown() {
            getSessionFactory().close();
        }
    }


