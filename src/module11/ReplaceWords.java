package module11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReplaceWords {

    public static void main(String[] args) {

        ReplaceWords replaceWords = new ReplaceWords();
        BufferedReader br = replaceWords.readFile();
        Map<String, String> map1 = replaceWords.map2("AAA", "BBB" ,br);
        System.out.println("Strings are replaced:" + map1);
    }

    private BufferedReader readFile() {
        BufferedReader br1;
        try {
           return br1 = new BufferedReader(new FileReader("C://Users/Димон/Desktop/SoftSkils/ReplaceWords/ReplaceWords.docx"));
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
            System.out.println("File is not found");
        }
        return null;
    }

    public Map<String, String> map2 (String oldString, String newString, BufferedReader br2) {
        Map <String, String> map3 = new HashMap<>();

        try {
            StringBuilder sb = new StringBuilder();
            String line = br2.readLine();

            while (line != null) {
                String[] str = line.split(" ");
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equals(oldString)) {
                        sb.append(str[i].replace(oldString, newString) + " ");
                    } else  {
                        sb.append(str[i] + " ");
                    }
                }
                line = br2.readLine();
                sb.append(System.lineSeparator());
            }
            String result = sb.toString();
            map3.put(oldString, result);
            return map3;

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("You have IOexception");
        }
        return null;
    }
}
