public class QuickSortV2 implements ArraySort{
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }
    private int partOfSort(int[] array,int start,int end){
        int left = start;
        for (int current = start;current<end;current++){
            if (array[current]<=array[end]){
                int tmp = array[left];
                array[left] = array[current];
                array[current] = tmp;
                left++;
            }
        }
        int tmp = array[left];
        array[left] = array[end];
        array[end] = tmp;
        return left;
    }
    private void quickSort(int [] array,int start,int end){
        if(start >=end) return;
        int rightStart = partOfSort(array,start,end);
        quickSort(array,start,rightStart-1);
        quickSort(array,rightStart+1,end);
    }
}
