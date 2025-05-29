package day21;
import java.util.*;;
public class mergesort  {
  static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) return;
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }

  static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;
    while (i <= mid && j <= right) {
      temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
    }
    while (i <= mid) temp[k++] = arr[i++];
    
    while (j <= right) temp[k++] = arr[j++];
    for (i = left, k = 0; i <= right; i++, k++) arr[i] = temp[k];
  }

  public static void main(String[] args) {
    int[] arr = {12, 11, 13, 5, 6, 7,8,97,95,97,9};
    mergeSort(arr, 0, arr.length - 1);
    for (int n : arr) System.out.print(n + " ");
  }
}
