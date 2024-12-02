import java.util.*;
// An exploration of basic input and output.
class BasicIO {
    // Reads and processes string input.
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // get first input (Enter name)
        System.out.print("Enter your name: ");
        String name = stdin.nextLine();

        // get second input (Enter age)
        System.out.print("Enter your age: ");
        int years = stdin.nextInt();

        // get third input (Enter height)
        System.out.print("Enter your height: ");
        int height = stdin.nextInt();

        System.out.println("your name is " + name);
        System.out.println("your age is " + years);
        System.out.println(years * 365);
        System.out.printf("2005년 09월 06일 현재 %s(%d)의 키는 %d cm 입니다.%n", name, years, height);
    } // method main
} // class BASIC_IO
