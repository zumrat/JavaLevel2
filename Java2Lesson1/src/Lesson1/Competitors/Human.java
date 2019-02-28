package Lesson1.Competitors;

public class Human implements Competitor{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " successfully completed cross");
        } else {
            System.out.println(name + " " + " failed cross");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + " successfully coped with the obstacle");
        } else {
            System.out.println(name + " " + " could not overcome the obstacle");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " successfully swam the distance");
        } else {
            System.out.println(name + " " + " could not swam the distance");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

}