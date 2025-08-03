package org.sci.week03;

public class Sorting {

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx] = temp;
    }
  }

  public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    }
    int mid = (left + right) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    int[] temp = new int[right - left + 1];
    int cur1 = left;
    int cur2 = mid + 1;
    int k = 0;
    while (cur1 <= mid && cur2 <= right) {
      if (arr[cur1] <= arr[cur2]) {
        temp[k] = arr[cur1];
        cur1++;
        k++;
      } else {
        temp[k] = arr[cur2];
        cur2++;
        k++;
      }
    }
    while (cur1 <= mid) {
      temp[k] = arr[cur1];
      cur1++;
      k++;
    }
    while (cur2 <= right) {
      temp[k] = arr[cur2];
      cur2++;
      k++;
    }

    k = 0;
    for(int i = left; i<= right; i++) {
      arr[i] = temp[k];
      k++;
    }
  }

  public static void printArray(int[] arr) {
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int[] a = new int[]{64, 25, 12, 22, 11};
    mergeSort(a, 0, a.length - 1);
    printArray(a);

//    System.out.println("********************SelectionSort*********************");
//
//    int[] arr1 = {64, 25, 12, 22, 11};
//    selectionSort(arr1);
//    printArray(arr1);
//
//    System.out.println("********************BubbleSort*********************");
//
//    int[] arr2 = {11, 12, 25, 34, 64, 90};
////    int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
//    bubbleSort(arr2);
//    printArray(arr2);
//
//    System.out.println("*******************InsertionSort**********************");
//
//    int[] arr3 = {12, 11, 13, 5, 6};
//    insertionSort(arr3);
//    printArray(arr3);
  }
}
