package ra.model;

public abstract class Animal {
    private int soChan;
    private String color;

    public abstract void makeSound();
    public void  move(){
        System.out.println("di chuyển");
    }
}
