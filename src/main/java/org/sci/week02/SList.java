package org.sci.week02;

public class SList {

  NodeS head;
  NodeS tail;

  int sz;

  public int size() {
    return sz;
  }

  public boolean isEmpty() {
    return sz == 0;
  }

  public void addFirst(int value) {

    if (sz == 0) {
      head = tail = new NodeS(value, null);
    } else {
      head = new NodeS(value, head);
    }

    sz++;
  }

  public void addLast(int value) {

    if (sz == 0) {
      head = tail = new NodeS(value, null);
    } else {
      tail.next = new NodeS(value, null);
      tail = tail.next;
    }

    sz++;
  }

  public void removeFirst() {
    if (sz == 0) {
      return;
    } else if (sz == 1) {
      head = tail = null;
    } else {
      head = head.next;
    }
    sz--;
  }

  public void removeLast() {
    if (sz == 0) {
      return;
    } else if (sz == 1) {
      head = tail = null;
    } else {
      tail = beforeTail();
      tail.next = null;
    }
    sz--;
  }

  public NodeS beforeTail() {
    NodeS current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    return current;
  }
}
