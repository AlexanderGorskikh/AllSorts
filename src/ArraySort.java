public interface ArraySort {
    void sort(int [] array);
    default void printArray(int [] array){
        for (int i:array){
            System.out.print(i+"|");
        }
    }
}
