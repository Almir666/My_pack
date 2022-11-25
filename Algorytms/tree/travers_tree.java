package Algorytms.tree;

public class travers_tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(12);
    
        root.left = n2;
        root.right = n3;
    
        n2.left = n4;
        n3.left = n5;
        n3.right = n6;
    
        n4.left = n7;
        n4.right = n9;
        n6.left = n10;
        n6.right = n11;
        order(root);

        System.out.println();
      }
    
      static void order(Node root) {
        if (root == null)
          return;
        System.out.printf("%d",root.value);
        order(root.left);
        order(root.right);
      }
    
    }
    
    class Node {
      int value;
    
      public Node(int value) {
        this.value = value;
      }
    
      Node left;
      Node right;
    }


