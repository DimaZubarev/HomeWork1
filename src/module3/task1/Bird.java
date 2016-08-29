package module3.task1;

public class Bird extends Animal {

    String sing;

    public Bird(String walk, String fly, String sing) {
        super(walk, fly);
        this.sing = sing;
    }
    void sing() {System.out.println("I am singing");}
}