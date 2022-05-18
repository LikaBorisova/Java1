package Lesson6;

public class Dog extends Animal {

    private int maxRun = 500;
    private int maxSwim = 10;

    public Dog (String name) {
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
        if (incomingDistance <= maxSwim) {
            System.out.println(name + " swam " + incomingDistance + " m " );
        }else{
            System.out.println(name + " swam " + maxSwim + " m " );
        }

    }

}
