package SampleSpringApp.telecomapp;

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
       Customer customer = context.getBean(Customer.class,"customer");
       System.out.println(customer);
       ServicePlan plan = customer.getService_plan();
       MyDbInfo info = plan.getMyDbInfo();
       System.out.println(info.getDbInfo());
    }
}
