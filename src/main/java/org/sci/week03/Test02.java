package org.sci.week03;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    String[] name = new String[n];
    int[] code = new int[n];

    for(int i = 0; i < n; i++) {
      name[i] = in.next();
      code[i] = in.nextInt();
    }
  }
}
