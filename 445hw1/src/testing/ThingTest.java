package testing;
import main.Thing;

public class ThingTest {
	private final static String t_name;
	private final static String stringOut;
	
	static {
		t_name = "Thing1";
		stringOut = t_name;
	}
	
	public static void stringTest() {
		Thing Thing = new Thing(t_name);
		if(Thing.toString().equals(stringOut)) {
			System.out.println("stringOut PASSED TESTING");
		}else {
			System.out.println("stringOut FAILED TESTING");
		}
	}
}
