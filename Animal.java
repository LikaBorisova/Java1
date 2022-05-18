package Lesson6;

public abstract class Animal {
    protected String name;


    public Animal (String name) {
        this.name = name;

    }
    public abstract void run (int incomingDistance);
    public abstract void swim (int incomingDistance);


}
