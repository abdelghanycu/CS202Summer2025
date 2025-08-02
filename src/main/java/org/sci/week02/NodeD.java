package org.sci.week02;

public class NodeD {
  int val;
  NodeD next;
  NodeD prev;

  NodeD() {

  }

  NodeD(int val, NodeD next, NodeD prev) {
    this.val = val;
    this.next = next;
    this.prev = prev;
  }
}
