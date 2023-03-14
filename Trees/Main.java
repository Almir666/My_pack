package Trees;

public class Main {
    public static void main(String[] args) {
        RedBlack_Tree rbTree = new RedBlack_Tree();
        rbTree.add(1);
        rbTree.add(44);
        rbTree.add(30);
        rbTree.add(10);
        rbTree.add(15);
        System.out.println(rbTree.add(60));
        System.out.println(rbTree.find(1));
        System.out.println(rbTree.find(44));
        System.out.println(rbTree.find(30));
        System.out.println(rbTree.find(10));
        System.out.println(rbTree.find(15));
        System.out.println(rbTree.find(60));
    }
}
