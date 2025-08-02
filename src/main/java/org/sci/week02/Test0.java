package org.sci.week02;

import java.util.ArrayList;

public class Test0 {

  public static void main(String[] args) {
    CS202Array a = new CS202Array();

    a.add(7);
    a.add(4);

//    if(5 > 3) {
//      return;
//    }

    a.remove();

    a.add(9);
    a.add(2);
    a.add(16);

    a.remove(2);

    System.out.println(a.search(4));
    System.out.println(a.search(9));

//    ArrayList<Integer> list = new ArrayList<>();
//    list.add(1);
//    list.remove(0);
  }
}
