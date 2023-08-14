public class SelectionSort implements ArraySort{
    // Сортировка выбором
    // 1. Ищем минимальный элемент массива
    // 2. Ставим его на первое место и исключаем его из сортировки
    @Override
    public void sort(int[] array) {
        for (int i=0;i<array.length;i++){
            int min_index = i;
            for (int j =i+1;j<array.length;j++){
                if (array[min_index]>array[j]){
                    min_index=j;
                }
            }
            if (min_index!=i){
                int tmp = array[min_index];
                array[min_index] = array[i];
                array[i] = tmp;
            }
        }
    }
}
