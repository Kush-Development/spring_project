package in.sp.beans.springProject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProject2Application.class, args);

		System.out.println("hello");
		
		 AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(SpringConfigFile.class);

			student std = (student)context.getBean("std1");

			std.display();

		 
		 //newAnnotationConfigApplicationContext(SpringConfigFile.class);
	}

}
