import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
		Exmaple1 example = context.getBean("example1", Exmaple1.class);
		Example2 example2 = context.getBean("example2", Example2.class);
		System.out.println(example.getId());
		System.out.println(example2.getElements());

	}

}
