package Lesson6;

public class Cat extends Animal {

    private int maxRun = 200;


    public Cat (String name) {
        super(name);
    }

    @Override
    public void run (int incomingDistance) {
        if (incomingDistance <= maxRun) {
            System.out.println(name + " ran " + incomingDistance + " m ");
        }else {
            System.out.println(name + " ran " + maxRun + " m ");
        }
    }
    @Override
    public void swim (int incomingDistance) {
        System.out.println(name + " can't swam");
    }



}
