public class BubbleSort {
  public int[] doBubbleSort(int[] nums) {
    int[] n={};
    for(int i=0;i<nums.length;i++){
      boolean isSorted;
      for(int j=1;j<nums.length - i; j++){
        isSorted = true;
        int k = j-1;
        if(nums[j]<nums[k]){
          int temp;
          temp = nums[k];
          nums[k]=nums[j];
          nums[j]=temp;
          isSorted = false;
        }
        if(isSorted == true) {
          n = nums;
        }
      }
    }
    return n;
  }
}