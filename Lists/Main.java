package Lists;

public class Main {
    public static void main(String[] args) {
        MyDlist list = new MyDlist();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.print();
        System.out.println();
        list.revert();
        list.print();
    }
}
