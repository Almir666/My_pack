package DZ_OOP.Tree_1;

import java.util.ArrayList;;

interface Tree<E> {
    void append(E parent, Human.link v1, Human.link v2, E children);

    ArrayList<Node> getData();
}

