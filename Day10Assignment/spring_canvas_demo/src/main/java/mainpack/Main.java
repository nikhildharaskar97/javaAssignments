package mainpack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.telstra1.spring_canvas_demo.Line;
import com.telstra1.spring_canvas_demo.Triangle;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		
		
        Triangle  t1 = (Triangle)context.getBean("triangle1");
		System.out.println(t1);
		
		Line  l1 = (Line)context.getBean("line1");
		System.out.println(l1);
	}

}
