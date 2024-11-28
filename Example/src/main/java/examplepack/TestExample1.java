package examplepack;

public class TestExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Janet");
		System.out.println(sb);
		//Method looking
		//append - adding a new string to the last
		sb.append("Thomas");
		System.out.println(sb);
		//insert - adding based on the intex
		sb.insert(3, "helo");
		System.out.println(sb);
		//replace - change the value from one place give
		sb.replace(6, 10, "come");
		System.out.println(sb);
		//reverse - String to reverse
		sb.reverse();
		System.out.println(sb);
		//delete - 
		sb.delete(4, 7);
		System.out.println(sb);

	}

}
