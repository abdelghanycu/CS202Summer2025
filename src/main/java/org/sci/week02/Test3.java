package org.sci.week02;

public class Test3 {
  public static void main(String[] args) {
    DList list = new DList();

    list.addLast(15);
    list.addFirst(9);

    list.removeFirst();

    list.addLast(7);
    list.addLast(6);

    list.removeLast();

    list.addLast(4);
    list.addFirst(17);

    System.out.println(list.size());

  }
}
