package annotationRequired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	public static void main(String[] args) {
	       ApplicationContext context = new
	ClassPathXmlApplicationContext("Beans.xml");
	       Patient patient = (Patient) context.getBean("patient");
	       System.out.println("Name : " + patient.getName() );
	       System.out.println("Age : " + patient.getAge() );
	   }

}
