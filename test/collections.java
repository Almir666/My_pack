package test;

import java.util.LinkedList;
import java.util.Queue;

public class collections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(44);
        queue.remove(3);
        System.out.println(queue.toString());
    }
}
