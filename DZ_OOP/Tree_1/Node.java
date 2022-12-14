package DZ_OOP.Tree_1;

public class Node<E> {
    E p1;
    E p2;
    Human.link re;

    public Node(E p1, Human.link re, E p2) {
        this.re = re;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", p1, re, p2);
    }
}
