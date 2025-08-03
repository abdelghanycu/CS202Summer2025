package org.sci.week03;

public class BubbleTest {

  public static void main(String[] args) {

    Bubble x1 = new Bubble("x1", null);
    Bubble x2 = new Bubble("x2", null);
    Bubble x3 = new Bubble("x3", null);
    Bubble x4 = new Bubble("x4", null);

    x1.neighbor = x2;
    x2.neighbor = x4;
    x4.neighbor = x3;

    System.out.println();

  }
}
