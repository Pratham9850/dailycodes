package SpringExercise1;

/**
 * Hello world!
 *
 */
import com.mybean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
       Technician technician = context.getBean(Technician.class,"customer");
       System.out.println(technician);
    }
}