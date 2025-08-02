package org.sci.week02;

public class CS202Array {

  int[] arr;
  int size;
  int cap;

  public CS202Array() {
    this.cap = 2;
    arr = new int[cap];
  }

  public CS202Array(int cap) {
    this.cap = cap;
    arr = new int[cap];
  }

  public void add(int val) {
    if(size == arr.length) {
      copy();
    }
    arr[size] = val;
    size++;
  }

  private void copy() {
    cap = cap * 2;
    int[] temp = new int[cap];

    for(int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }

    arr = temp;
  }

  public void remove()  {
    arr[size - 1] = 0;
    size--;
  }

  public boolean search(int val) {
    for(int i = 0; i < size; i++) {
      if(arr[i] == val) {
        return true;
      }
    }
    return false;
  }

  public void remove(int index) {
    if(index < 0 || index >= size) {
      return;
    }
    for(int i = index; i < size - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[size - 1] = 0;
    size--;
  }
}
