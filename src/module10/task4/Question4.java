package module10.task4;

public class Question4 {

    public void g() throws Exception1 {
        throw new Exception1();
    }

    public void f() throws Exception2 {
        try {
            g();
        } catch (Exception1 e1){
            System.out.println(e1.getStr1());
            throw new Exception2();
        }
    }

    public static void main(String[] args) {
       Question4 q4 = new Question4();
        try {
            q4.f();
        } catch (Exception2 e2) {
            System.out.println(e2.getStr2());
        }
    }
}

