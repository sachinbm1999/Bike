package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("annotation");
		Person per= (Person)context.getBean("myPerson");
		
		System.out.println("Person Id = "+per.getId());
		System.out.println("Person Name = "+per.getName());
		System.out.println("Person Gender = "+per.getGender());
		System.out.println("Person Age = "+per.getAge());
		System.out.println("Person Phoneno. = "+per.getPhoneno());
		System.out.println("Person Address = "+per.getAddress());
		System.out.println("Person Pincode = "+per.getPincode());
	}

}
