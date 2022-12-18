package DZ_OOP.Tree_1;

import java.util.Scanner;;

public class Presenter {
    public void start() {
        GeoTree gt = new GeoTree();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println(" 1: '+'  2: '-' 3: '*' 4: '/'");
                String key = in.next();
                switch (key) {
                    case "1":
                        String p1 = in.next();
                        String p2 = in.next();
                        String v1 = in.next();
                        String v2 = in.next();
                        gt.append(p1, v1, v2, p2);
                        break;
                    case "2":
                        sub.action();
                        break;
                    case "3":
                        mult.action();
                        break;    
                    case "4":
                        div.action();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}
