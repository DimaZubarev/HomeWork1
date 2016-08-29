package module3.task1;

public class Animal {

      String walk;
      String fly;

    public Animal(String walk, String fly) {
        this.walk = walk;
        this.fly = fly;
    }

    void walk() {
        System.out.println("I am walking");
    }
    void fly () {System.out.println("I am flying");}
}
