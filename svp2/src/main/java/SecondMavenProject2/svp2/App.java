package SecondMavenProject2.svp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student student = new Student(1, "Arjun", 78);
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses= factory.openSession();		
		
		Transaction tr = ses.beginTransaction();
		ses.persist(student);
		//hibernate method to add data we will use persist method// ex insert method
		
		tr.commit();
		ses.close();
    }
}
