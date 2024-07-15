package in.srivath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	//context.getBean(UserDao.class).getData();
	
	ConfigurableApplicationContext confContext= (ConfigurableApplicationContext)context; 
	confContext.close();
}
}
