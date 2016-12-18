package strings;

public class Replacing {
	public static void main(String[] args) {
		System.out.println(Splitting.knights.replaceFirst("f\\w+", "located"));
		System.out.println(Splitting.knights.replaceAll("shrubbering|tree|herring", "banana"));
	}
}
