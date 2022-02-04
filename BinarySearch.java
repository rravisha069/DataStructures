public class BinarySearch {
  public int search(int[] arr, int l, int r, int x) {
    if(r>=l) {
      int mid = l+(r-l)/2;

      if(x == arr[mid]) {
        return 1;
      }

      if(x<arr[mid]) {
        return search(arr, l, mid-1, x);
      }

      return search(arr, mid+1, r, x);
    }
    return -1;
  }
}