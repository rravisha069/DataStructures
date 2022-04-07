public class BubbleSort {
  public int[] doBubbleSort(int[] nums) {
    int arr[] = {1,2,3,4,5};
	    
    boolean doSort = true; //optimization
    for(int i=0; i<arr.length && doSort; i++) {
        doSort = false;
        for (int j=1; j<arr.length; j++) {
            int k = j-1;
            if(arr[k] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                doSort = true;
            }
        }
    }

    return arr;
  }
}
