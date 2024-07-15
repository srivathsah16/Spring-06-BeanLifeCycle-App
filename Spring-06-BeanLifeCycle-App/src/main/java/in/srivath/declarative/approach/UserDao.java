package in.srivath.declarative.approach;

public class UserDao {
	public UserDao() {
		System.out.println("UserDao::from annotation.approach - Constructor...");
	}
	
	public void init() {
		System.out.println("init method...");
	}
	public void getData() {
		System.out.println("getting data from db...");
	}
	public void destroy() {
		System.out.println("destroy method...");
	}
}
