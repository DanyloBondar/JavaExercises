package TasksLecture_1;

public class FibonacciSequence {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println(x);
            x = x + y;
            y = x - y;
        }
    }
}
