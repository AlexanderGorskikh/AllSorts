public class InsertionSort implements ArraySort{
    // Сортировка вставками
    @Override
    public void sort(int[] array) {
        for (int i =1;i<array.length;i++){
            int sorted = i-1;
            while(sorted>-1 && array[sorted]>array[sorted+1]){
                int tmp = array[sorted];
                array[sorted] = array[sorted+1];
                array[sorted+1] = tmp;
                sorted--;
            }
        }
    }

}
