
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student bean = (Student)context.getBean("s1");
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		
	
	}
	

}
