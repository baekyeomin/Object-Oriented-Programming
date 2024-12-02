package kr.ac.kookmin.samples;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String myString = "Hello";
		myString = myString + " world";
		System.out.println(myString);
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};

		for (int i = 0; i<10; i++){
			System.out.println(numbers[i]);
		}
	}

}
