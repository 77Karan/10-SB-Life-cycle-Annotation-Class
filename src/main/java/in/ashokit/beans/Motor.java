package in.ashokit.beans;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Motor 
{
	public Motor()
	{
		System.out.println("Mptor Constructor creating");
	}
	
	
	public void doWork()
	{
		System.out.println("Motor doing Work");
	}
	@PreDestroy
	public void stop()
	{
		System.out.println("Motor Stopped");
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Motor starting");
	}
	

}
