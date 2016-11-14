package module10.task2;

public class MainTask2 {
    public static void main(String[] args){

        try {
            throw new ExceptionClass("Exception");
        }catch (ExceptionClass e){
            e.printStr();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
