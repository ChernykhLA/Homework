public class ThreeWords {
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }
    }
}