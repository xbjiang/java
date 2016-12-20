
public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(System.getProperties());
			return;
		} finally {
			System.out.println("This line will always be executed!");
		}
	}
}
