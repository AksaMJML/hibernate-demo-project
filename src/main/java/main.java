import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(4);
        student.setName("Shanuka");
        student.setAge(24);

        Configuration config = new Configuration();
        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        //session.persist(student);

       // System.out.println(session.find(Student.class,3));

        //session.remove(session.find(Student.class,3));

        session.merge(student);

        transaction.commit();
        session.close();
        factory.close();
    }
}
