package org.sci.week02;

public class Test1 {

  public static void main(String[] args) {
    NodeS n1 = new NodeS(5, null);
    NodeS n2 = new NodeS(7, null);
    NodeS n3 = new NodeS(9, null);
    NodeS n4 = new NodeS(11, null);


    n3.next = n4;
    n2.next = n3;
    n1.next = n2;

    print(n1);

    System.out.println();
  }


  private static void print(NodeS x) {
    while (x != null) {
      System.out.println(x.val);
      x = x.next;
    }
  }
}
