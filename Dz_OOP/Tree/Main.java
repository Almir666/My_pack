package Dz_OOP.Tree;

public class Main {
    public static void main(String[] args) {
        var sveta = new Person("Svetlana");
        var artem = new Person("Artemyi");
        var sasha = new Person("Alexandra");
        var eva = new Person("Eva");
        var serg = new Person("Sergey");

        GeoTree gt = new GeoTree();

        gt.append(sveta, Human.link.parent, Human.link.child, artem);
        gt.append(sveta, Human.link.sister, Human.link.sister, sasha);
        gt.append(sveta, Human.link.sister, Human.link.brother, serg);
        gt.append(sveta, Human.link.sister, Human.link.sister, eva);

        System.out.println(new Search(gt).spend(sveta, Human.link.sister));
    }
}
