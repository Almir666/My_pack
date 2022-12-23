package DZ_OOP.Tree_1;

import java.util.ArrayList;

class GeoTree<E> implements Tree<E> {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(E p1, Human.link v1, Human.link v2, E p2) {
        tree.add(new Node(p1, v1, p2));
        tree.add(new Node(p2, v2, p1));
    }
}

