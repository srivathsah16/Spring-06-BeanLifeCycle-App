package in.srivath.programatic.approach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean {

	public UserDao() {
		System.out.println("UserDao::from programatic.approach - Constructor...");
	}
	public void getData() {
		System.out.println("getting data from db...");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method....");
		
	}
	public void destroy() throws Exception {
		System.out.println("destroy method....");
		
	}
}
