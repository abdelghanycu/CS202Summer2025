package org.sci.week03;

import org.sci.week02.DList;

public class StackList extends DList {

  public void push(int value) {
    addFirst(value);
  }

  public int pop() {
    int temp = getFirst();
    removeFirst();
    return temp;
  }

  public int top() {
    int temp = getFirst();
    return temp;
  }
}