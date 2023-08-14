import java.util.Random;

public class Main {
    private static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {
        int[] test = testArray();
        ArraySort sorter = new QuickSort();
        sorter.sort(test);
        sorter.printArray(test);
    }

    private static int[] testArray() {
        Random rnd = new Random();
        int[] test = new int[ARRAY_SIZE];
        for (int i = 0; i < test.length; i++) {
            test[i] = rnd.nextInt(0, 50);
            System.out.print(test[i] + "|");
        }
        System.out.println();
        return test;
    }
}