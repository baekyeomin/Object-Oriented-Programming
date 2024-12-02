import java.awt.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);  // 첫 번째 Rectangle 객체 생성
        System.out.println(r1);
        
        Rectangle r2 = r1;
        r2.grow(10, 20);  
        System.out.println(r2);
    }
}
