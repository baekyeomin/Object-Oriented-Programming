// An exploration of primitive data types.
class Data {
    // Declares and uses variables of various types.
    public static void main(String[] args) {
        int num1 = 40, num2 = 65, x = 99;
        float num3 = 18.53f;
        char letter = 'x';
        num1 = 777;
        boolean flag = false;
        final int FIXED = 2020;
        // FIXED = 3030;  // 에러: final 변수는 값을 재할당할 수 없음
        // num1 = flag;   // 에러: boolean을 int로 변환할 수 없음
        double num4 = num1; 

        System.out.println("The value of num1: " + num1);
        System.out.println("The value of num3: " + num3);
        System.out.println("The value of x: " + x);
        System.out.println("The letter x: " + letter);
        System.out.println("The value of flag: " + flag);
        System.out.println("The value of FIXED: " + FIXED);
        System.out.println("The value of num4: " + num4);

        System.out.println("Updated value of num1: " + num1);
        
      
        
    } // method main
} // class Data
