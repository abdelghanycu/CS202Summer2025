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

  public static void printArray(int[] arr) {
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    System.out.println("********************SelectionSort*********************");

    int[] arr1 = {64, 25, 12, 22, 11};
    selectionSort(arr1);
    printArray(arr1);

    System.out.println("********************BubbleSort*********************");

    int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(arr2);
    printArray(arr2);

    System.out.println("*******************InsertionSort**********************");

    int[] arr3 = {12, 11, 13, 5, 6};
    insertionSort(arr3);
    printArray(arr3);
  }
}
