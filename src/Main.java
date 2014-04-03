import co.id.service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tombisnis@yahoo.com
 */
public class Main {
    public static void main (String[]args){
        System.out.println("Konfigurasi Spring 4 Hibernate 4 Versi 1");  
        
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeService employeeService = (EmployeeService) configurableApplicationContext.getBean("employeeService");
        
        System.out.println("List : "+employeeService.getAllEmployees());
	
        configurableApplicationContext.close();
    }
}