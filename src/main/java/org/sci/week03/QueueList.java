package org.sci.week03;

import org.sci.week02.DList;

public class QueueList extends DList {

  public void enqueue(int value) {
    addFirst(value);

  }
  public int dequeue() {
    int temp = getLast();
    removeLast();
    return temp;
  }
  public int peek() {
    int temp = getLast();
    return temp;
  }

}
