package org.sci.week03;

public class StackByQueue extends QueueList {

  public static void main(String[] args) {
    StackByQueue x = new StackByQueue();
    x.push(5);
    x.push(7);
    x.push(9);
    x.push(6);

    System.out.println(x.pop());

    x.push(45);

    System.out.println(x.pop());
    System.out.println(x.pop());
  }

  public void push(int value) {
    int size = size();
    enqueue(value);
    while (size > 0) {
      enqueue(dequeue());
     size--;
    }
  }

  public int pop() {
    return dequeue();
  }

  public int top() {
    return peek();
  }
}
