package org.sci.week03;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    Student[] a = new Student[n];

    for (int i = 0; i < n; i++) {
      String name = in.next();
      int code = in.nextInt();
      a[i] = new Student(name, code);
    }
  }
}
