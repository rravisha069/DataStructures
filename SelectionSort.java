public class SelectionSort {
  public void doSort(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      int minValue = i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[j]>arr[minValue]) {
          minValue = j;
        }
      }
      int temp = arr[minValue];
      arr[minValue] = arr[i];
      arr[i] = temp;
    }
  }
}