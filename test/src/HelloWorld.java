import pair1.Pair;
public class HelloWorld {
	public static void main(String[] args) {
		Pair<String> pair = new Pair<>();
		System.out.println(pair.toString());
		String str1 = "java";
		String str2 = new String("java");
		System.out.println(str1.equals(str2));
	}
}