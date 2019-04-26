package chapter_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationAssembleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter_02/beans.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.save();
	}
}
