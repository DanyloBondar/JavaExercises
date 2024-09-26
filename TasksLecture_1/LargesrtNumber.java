package TasksLecture_1;

public class LargesrtNumber {
    public static void main(String[] args) {
        int[] arr = {-2, 4, 5, 1, -32, 65, 3, 98};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("the largest number is: " + max);
    }
}
