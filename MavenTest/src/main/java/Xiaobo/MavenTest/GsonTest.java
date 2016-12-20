package Xiaobo.MavenTest;

import com.google.gson.Gson;
import java.util.Map;
import java.util.HashMap;

public class GsonTest {
	public static void main(String[] args) {
		Gson json = new Gson();
		User user1 = new User(25, "add1");
		User user2 = new User(26, "add2");
		
		Map<String, User> map = new HashMap<String, User>();
		map.put("Tom", user1);
		map.put("Jack", user2);
		System.out.println(json.toJson(map));
	}
}

class User {
	private int age;
	private String address;
	public User(int age, String address) {
		this.age = age;
		this.address = address;
	}
}
