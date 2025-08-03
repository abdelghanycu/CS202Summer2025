package org.sci.week03;

public class Test01 {

  public static void main(String[] args) {
    StackList stack= new StackList();
    stack.push(5);
    stack.push(3);
    stack.pop();
    stack.push(2);
    stack.push(8);
    stack.pop();
    stack.pop();
    stack.push(9);
    stack.push(1);
    stack.pop();
    stack.push(7);
    stack.push(6);
    stack.pop();
    stack.pop();
    stack.push(4);
    stack.pop();
    stack.pop();
    System.out.println();
  }
}
