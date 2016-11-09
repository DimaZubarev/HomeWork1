package module10.Task2;

public class MainTask2 {
    public static void main(String[] args) throws ExceptionClass {

        try {
            throw new ExceptionClass("Exception");
        }catch (ExceptionClass str){
            System.out.println(str.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
    }
}
