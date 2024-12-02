public class ConcatTester {
    public static void main(String[] args) {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String message = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2);

        System.out.println("결과 문자열: " + message);
        System.out.println("문자열 길이: " + message.length());
    }
}
