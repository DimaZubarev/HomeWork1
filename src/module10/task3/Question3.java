package module10.task3;

import java.util.List;

public class Question3 {
    public static void main(String[] args) {

        List<Integer> number = null;
        try {
            number.add(33);
        }catch (NullPointerException e){
            System.out.println("Нуливое значение: " + e);
        }

    }
}
