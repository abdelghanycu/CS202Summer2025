package org.sci.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex6_24 {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    stack.push(5);
    stack.push(7);
    stack.push(11);
    stack.push(13);
    stack.push(17);
    stack.push(3);

    System.out.println(solve(stack, 7));
    System.out.println(solve(stack, 99));
  }

  public static boolean solve(Stack<Integer> stack, int num) {
    Queue<Integer> queue = new LinkedList<Integer>();
    boolean found = false;

    while (!stack.isEmpty()) {
      int top = stack.pop();
      if(top == num) {
        found = true;
      }
      queue.add(top);
    }

    while (!queue.isEmpty()) {
      int top = queue.remove();
      stack.push(top);
    }

    while (!stack.isEmpty()) {
      int top = stack.pop();
      queue.add(top);
    }

    while (!queue.isEmpty()) {
      int top = queue.remove();
      stack.push(top);
    }

    return found;
  }
}
