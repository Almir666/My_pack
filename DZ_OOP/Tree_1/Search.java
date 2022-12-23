package DZ_OOP.Tree_1;

import java.util.ArrayList;

class Search {
    ArrayList<Node> tree;

    public Search(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<E> spend(Human p, Human.link re) {
        var result = new ArrayList<E>();
        for (Node t : tree) {
            if (t.p2.getName() == p.getName() && t.re == re) {
                result.add(t.p1);
            }
        }
        return result;
    }
}
