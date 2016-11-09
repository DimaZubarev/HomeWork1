package module10.task5;

public class Question5 {

    public static void test(int item) throws Exception1, Exception2, Exception3 {
        switch (item) {
            case 1:
                throw new Exception1("1");
            case 2:
                throw new Exception2("2");
            case 3:
                throw new Exception3("3");
        }
    }

    public static void main(String[] args) {
        try {
            test(1);
        } catch (Exception1 | Exception2 | Exception3 e) {
            System.out.println(e);
        }
    }
}
