public class BubbleSort implements ArraySort{
    // Пузырьковая сортировка
    @Override
    public void sort(int[] array) {
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j+1]<array[j]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
