package org.sci.week04;

import java.util.LinkedList;
import org.sci.week02.DList;

public class DequeList {

//  LinkedList<Integer> list = new LinkedList<>();
  DList list = new DList();

  public void enqueue(int value) {
    list.addFirst(value);
  }

//  public void addLast(int value) {
//    list.addLast(value);
//  }


  public void dequeue() {
    list.removeFirst();
  }

//  public void removeLast() {
//    list.removeLast();
//  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int size() {
    return list.size();
  }
}
