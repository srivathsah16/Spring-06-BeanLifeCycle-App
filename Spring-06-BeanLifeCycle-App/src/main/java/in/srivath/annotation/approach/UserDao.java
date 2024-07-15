package in.srivath.annotation.approach;

public class UserDao {
	public UserDao() {
		System.out.println("UserDao::from declarative.approach - Constructor...");
	}
	public void init() {
		System.out.println("init method::getting connection from db...");
	}
	public void getData() {
		System.out.println("getting data from db...");
	}
	public void destroy() {
		System.out.println("destroy method::closing connection from db...");
	}
}
