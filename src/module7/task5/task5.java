package module7.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task5 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(10000);
        List<String> strings = new ArrayList<>(1000);
        List<String> stringList = new LinkedList<>();


        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000000; i ++) {
            for(int j = 0 ; j < 1000000; j ++) {
                int a = i * 1000 + 365000 - 3100000 + 365;
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
