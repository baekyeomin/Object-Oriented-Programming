package default_package;

public class Welcome {

	public static void main(String[] args) {
		String[] greeting = new String[3];
		
		greeting[0] = "Welcome to Java";
		greeting[1] = "School of Computer Science";
		greeting[2] = "Kookmin University";
		
		for (int i = 0; i < greeting.length ; i++)
			System.out.println(greeting[i]);

	}

}
