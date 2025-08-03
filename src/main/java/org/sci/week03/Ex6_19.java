package org.sci.week03;

import java.util.Scanner;
import java.util.Stack;

public class Ex6_19 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String expr = in.nextLine(); // 5 2 + 8 3 - * 4 /
    System.out.println(solve(expr));
  }

  public static double solve(String expr) {
    Stack<String> st = new Stack<>();

    String[] parts = expr.split(" ");

    for (int i = 0; i < parts.length; i++) {

      String part = parts[i];
      if (isOperator(part)) {
        String last = st.pop();
        String beforeLast = st.pop();
        st.push(cacl(beforeLast, last, part) + "");
      } else {
        st.push(part);
      }
    }

    if (st.size() == 1 && isValue(st.peek())) {
      return getValue(st.peek());
    }
    return -1;
  }

  private static double cacl(String first, String second, String op) {
    if (op.equals("+")) {
      return getValue(first) + getValue(second);
    } else if (op.equals("-")) {
      return getValue(first) - getValue(second);
    } else if (op.equals("*")) {
      return getValue(first) * getValue(second);
    } else {
      return getValue(first) / getValue(second);
    }
  }

  private static boolean isValue(String val) {
    try {
      Double.parseDouble(val);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  private static boolean isOperator(String op) {
    return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
  }

  private static Double getValue(String val) {
    return Double.parseDouble(val);
  }
}
