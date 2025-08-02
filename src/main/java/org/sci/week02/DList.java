package org.sci.week02;

public class DList {

  NodeD header;
  NodeD trailer;
  int sz;

  public DList() {
    header = new NodeD();
    trailer = new NodeD();
    header.next = trailer;
    trailer.prev = header;
  }

  public int size() {
    return sz;
  }

  public boolean isEmpty() {
    return sz == 0;
  }

  public void addFirst(int value) {
    NodeD newNode = new NodeD(value, header.next, header);
    header.next.prev = newNode;
    header.next = newNode;
    sz++;
  }

  public void addLast(int value) {
    NodeD newNode = new NodeD(value, trailer, trailer.prev);
    trailer.prev.next = newNode;
    trailer.prev = newNode;
    sz++;
  }

  public void removeFirst() {
    header.next.next.prev = header;
    header.next = header.next.next;
    sz--;
  }

  public void removeLast() {
    trailer.prev.prev.next = trailer;
    trailer.prev = trailer.prev.prev;
    sz--;
  }
}
