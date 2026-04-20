import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		String s1 = "Nagpur";
		String s2 = "Pune";
		String s3 = "Mumbai";
		String s4 = "Dehli";
		String s5 = "Banglore";
		System.out.println(arrList);
		arrList.add(s1);
		arrList.add(s2);
		arrList.add(s3);
		arrList.add(s4);
		arrList.add(s5);
		System.out.print(arrList);
	}
}
