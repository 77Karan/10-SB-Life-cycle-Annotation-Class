package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class ConnectionManager implements InitializingBean, DisposableBean
{
	public ConnectionManager() 
	{
		System.out.println("Creating ConnectionManager Consturctor");
	}
	
	public void afterPropertiesSet()
	{
		System.out.println("After PropertiesSet in ConnectionPool");
	}
	
	public void getMyConnection()
	{
		System.out.println("Getting my Jio Connection");
	}
	
	public void destroy()
	{
		System.out.println("Destroy the Connectionpool");
	}
	

}
