import java.util.*;
class Main {

  public static void main(String[] args) {
  
  int nums[] = {2,4,6,8,90};

  BinarySearch bs = new BinarySearch();
  System.out.println(bs.search(nums, 0, nums.length-1, 90));
}
}