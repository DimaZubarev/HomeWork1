package module10.task4;

public class Question4 {

    public static void main(String[] args) {
        try {
            f();
        } catch (NullPointerException e) {
            throw new ClassCastException();
        }
    }

    private static void f() {
        g();
    }

    private static void g() {
        throw new NullPointerException();
    }
}

