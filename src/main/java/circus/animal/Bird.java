package circus.animal;

public class Bird extends Animal {
    @Override
    public int getValue() {
        return 20;
    }

    public void fly() {
        System.out.println("Whee ...");
    }
}
