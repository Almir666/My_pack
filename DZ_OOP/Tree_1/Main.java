package DZ_OOP.Tree_1;

public class Main {
    public static void main(String[] args) {
        var sveta = new Person<Integer>("Svetlana", 1);
        var artem = new Person<Integer>("Artemyi", 2);
        var sasha = new Person<Integer>("Alexandra", 3);
        var eva = new Person<Integer>("Eva", 4);
        var serg = new Person<Integer>("Sergey", 5);

        GeoTree gt = new GeoTree();

        gt.append(sveta, Human.link.parent, Human.link.child, artem);
        gt.append(sveta, Human.link.sister, Human.link.sister, sasha);
        gt.append(sveta, Human.link.sister, Human.link.brother, serg);
        gt.append(sveta, Human.link.sister, Human.link.sister, eva);

        System.out.println();
        System.out.println("Тут мы ищем всех сестер Светланы:");
        System.out.println(new Search(gt).spend(sveta, Human.link.brother));
        System.out.println();
        System.out.println("Тут мы ищем всех детей светланы");
        System.out.println(new Search(gt).spend(sveta, Human.link.child));

    }
}
