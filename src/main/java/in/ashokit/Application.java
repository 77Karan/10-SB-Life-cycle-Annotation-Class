package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.ConnectionManager;
import in.ashokit.beans.Motor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		Motor m1 = context.getBean(Motor.class);
		m1.doWork();
		
		ConnectionManager cn = context.getBean(ConnectionManager.class);
		cn.getMyConnection();
	}

}
