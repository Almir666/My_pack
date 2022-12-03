package test;

import java.util.ArrayList;

public class Robot {
    enum State {
        on, off;
    }

    private static int defaultIndex;
    private static ArrayList<String> names;
    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    private int level;
    private String name;
    private State state;

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }
    public State getState() {
        return state;
    }

    public Robot(String name, int level) {
        if ((name.isEmpty() || Character.isDigit(name.charAt(0))) || Robot.names.indexOf(name) != -1) {
            this.name =
            String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot.names.add(this.name);
        this.level = level;
        this.state = State.off;
    }
    public Robot(String name) {
        this(name, 1);
    }
    public Robot() {
        this("");
    }

    public void power() {
        if (this.state == State.off) {
            this.powerOn();
            this.state = State.on;
        } else {
            this.powerOff();
            this.state = State.off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

        private void startBIOS() {
            System.out.println("Start BIOS...");
        }
    
        private void startOS() {
            System.out.println("Start OS...");
        }
    
        private void sayHi() {
            System.out.println("Hello world...");
        }
    
        private void stopBIOS() {
            System.out.println("Stop BIOS...");
        }
    
        private void stopOS() {
            System.out.println("Stop OS...");
        }
    
        private void sayBye() {
            System.out.println("Bye...");
        }
    
        public void work() {
            if (this.state == State.on) {
                System.out.println("Working...");
            }
        }

}



