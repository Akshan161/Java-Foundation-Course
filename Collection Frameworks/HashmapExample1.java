import java.util.HashMap;

public class HashmapExample1 {
	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		System.out.println(data);
		data.put(100, "Abcd");
		data.put(200, "Lmno");
		data.put(300, "Pqrs");
		data.put(400, "Wxyz");
		System.out.println(data);
	}
	
}