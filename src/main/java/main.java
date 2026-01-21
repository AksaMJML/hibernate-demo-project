import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Aksa");
        student.setAge(28);

        Configuration config = new Configuration();
        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        session.persist(student);
    }
}
