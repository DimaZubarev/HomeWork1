package module10.Task1;

public class Task1 {
    public static void main(String[] args) throws Throwable {
        try {
            throw new Exception("Exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
    }
}
