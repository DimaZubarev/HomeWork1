package module11.task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Question2 {

    public static void main(String[] args) {

        String oldString = "AAA";
        String newString = "BBB";
        Map<String, String> stringsToReplace = new HashMap<>();
        stringsToReplace.put(oldString, newString);

        Question2 question2 = new Question2();
        BufferedReader br = question2.readFromFile();
        Map<String, String> replace = question2.replaceWords(stringsToReplace, br);
        question2.filecontantReplacer(replace);
    }

    public BufferedReader readFromFile() {
        BufferedReader br;
        try {
            return br = new BufferedReader(new FileReader("C://Users/Димон/Desktop/SoftSkils/ReplaceWords/ReplaceWords.docx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File is not found");
        }
        return null;
    }

    public Map<String, String> replaceWords(Map<String, String> stringsToReplace, BufferedReader bufferedReader) {
        Map<String, String> replacer = new HashMap<>();
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {

                    if (stringsToReplace.containsKey(s[i])) {
                        sb.append(stringsToReplace.get(s[i]) + " ");
                    } else {
                        sb.append(s[i] + " ");
                    }
                }
                line = bufferedReader.readLine();
            }
            String result = sb.toString();
            replacer.put(stringsToReplace.values().toArray()[0].toString(), result);
            return replacer;

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");
        }
        return null;
    }

    public void filecontantReplacer(Map<String, String> writeReplace) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users/Димон/Desktop/SoftSkils/ReplaceWords/ReplaceWords.docx"));
            for (String key :
                    writeReplace.keySet()) {
                bw.write(String.valueOf(writeReplace.get(key)));
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("read failed");
        }
    }
}
