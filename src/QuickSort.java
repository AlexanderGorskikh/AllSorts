public class QuickSort implements ArraySort {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        if (start >= end) return;
        int rightStart = partOfSort(array, start, end);
        quickSort(array, start, rightStart-1);
        quickSort(array, rightStart, end);
    }

    private int partOfSort(int[] array, int left, int right) {
        int pivot = array[(left+right)/ 2];  // Выбираем средний элемент в массиве(опорный)
        while (left <= right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;
            if (left <= right) {
                int tmp = array[left];  // Обработка случая при котором будут сравниваться одинаковые элементы
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }

}
