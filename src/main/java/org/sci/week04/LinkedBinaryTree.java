package org.sci.week04;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree {

  private Node root;
  private int sz;

  public LinkedBinaryTree() {
    root = null;
    sz = 0;
  }

  public boolean isEmpty() {
    return sz == 0;
  }

  public int size() {
    return sz;
  }

  public void insert(int value) {
    if (root == null) {
      root = new Node(value, null, null);
    } else {
      Node current = root;
      while (true) {
        if (current.getValue() >= value) {
          if (current.getLeft() == null) {
            current.setLeft(new Node(value, null, null));
            break;
          }
          current = current.getLeft();
        } else {
          if (current.getRight() == null) {
            current.setRight(new Node(value, null, null));
            break;
          }
          current = current.getRight();
        }
      }
    }
    sz++;
  }

  public boolean search(int value) {
    Node current = root;
    while (current != null) {
      if (current.getValue() > value) {
        current = current.getLeft();
      } else if (current.getValue() < value) {
        current = current.getRight();
      } else {
        return true;
      }
    }
    return false;
  }

  public void delete(int value) {
    if (!search(value)) {
      return;
    }
    Node parent = root;
    Node current = root;
    while (current != null) {
      if (current.getValue() > value) {
        parent = current;
        current = current.getLeft();
      } else if (current.getValue() < value) {
        parent = current;
        current = current.getRight();
      } else {
        if (current.getLeft() == null && current.getRight() == null) {
          if (current == root) {
            root = null;
            break;
          }
          if (parent.getLeft() == current) {
            parent.setLeft(null);
          } else {
            parent.setRight(null);
          }
        } else if (current.getLeft() != null ^ current.getRight() != null) {
          Node mySon;
          if (current.getLeft() != null) {
            mySon = current.getLeft();
          } else {
            mySon = current.getRight();
          }

          if (current == root) {
            root = mySon;
          } else {
            if (parent.getLeft() == current) {
              parent.setLeft(mySon);
            } else {
              parent.setRight(mySon);
            }
          }
        } else {
          Node maxNode = getMax(current.getLeft());
          maxNode.setRight(current.getRight());

          if (current == root) {
            root = current.getLeft();
          } else {
            parent.setLeft(current.getLeft());
          }
        }
        break;
      }
    }
    sz--;
  }

  private Node getMax(Node node) {
    while (node.getRight() != null) {
      node = node.getRight();
    }
    return node;
  }

  // C-8.36
  public void pruneSubtree(int value) {
    if (!search(value)) {
      return;
    }
    Node parent = root;
    Node current = root;
    while (current != null) {
      if (current.getValue() > value) {
        parent = current;
        current = current.getLeft();
      } else if (current.getValue() < value) {
        parent = current;
        current = current.getRight();
      } else {
        if (current == root) {
          root = null;
          sz = 0;
          return;
        }

        if (parent.getLeft() == current) {
          parent.setLeft(null);
          sz -= countSubTree(current);
        } else {
          parent.setRight(null);
          sz -= countSubTree(current);
        }
        return;
      }
    }
  }

  private int countSubTree(Node cur) {
    if (cur == null) {
      return 0;
    }
    return countSubTree(cur.getLeft()) + countSubTree(cur.getRight()) + 1;
  }

  // C-8.28
  public int getHeight() {
    return getHeight(root);
  }

  private int getHeight(Node current) {
    int height = 0;
    if (current != null) {
      int leftHeight = getHeight(current.getLeft());
      int rightHeight = getHeight(current.getRight());
      height = Math.max(leftHeight, rightHeight) + 1;
    }
    return height;
  }

  public int getHeight2() {
    int lvl = 0;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      lvl++;
      int size = q.size();
      while(size > 0){
        Node current = q.remove();
        if(current.getLeft() != null){
          q.add(current.getLeft());
        }
        if(current.getRight() != null){
          q.add(current.getRight());
        }
        size--;
      }
    }
    return lvl;
  }

  // R-8.18 R-8.19 C-8.45
  public void traversals() {
    if (root != null) {
      System.out.println("preOrder");
      preOrder(root);
      System.out.println("inOrder");
      inOrder(root);
      System.out.println("postOrder");
      postOrder(root);
    }
  }

  private void preOrder(Node node) {
    System.out.println(node.getValue());
    if (node.getLeft() != null) {
      preOrder(node.getLeft());
    }
    if (node.getRight() != null) {
      preOrder(node.getRight());
    }
  }

  private void inOrder(Node node) {
    if (node.getLeft() != null) {
      inOrder(node.getLeft());
    }
    System.out.println(node.getValue());
    if (node.getRight() != null) {
      inOrder(node.getRight());
    }

  }

  private void postOrder(Node node) {
    if (node.getLeft() != null) {
      postOrder(node.getLeft());
    }
    if (node.getRight() != null) {
      postOrder(node.getRight());
    }
    System.out.println(node.getValue());
  }

  // R-8.5
  public int countLeftLeaf() {
    return countLeftLeaf(root, false);
  }

  private int countLeftLeaf(Node cur, boolean isLeft) {
    if (cur.getLeft() == null && cur.getRight() == null) {
      if (isLeft) {
        return 1;
      } else {
        return 0;
      }
    }
    int cnt = 0;
    if (cur.getLeft() != null) {
      cnt += countLeftLeaf(cur.getLeft(), true);
    }

    if (cur.getRight() != null) {
      cnt += countLeftLeaf(cur.getRight(), false);
    }
    return cnt;
  }
}
