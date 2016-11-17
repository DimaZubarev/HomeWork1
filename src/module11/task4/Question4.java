package module11.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) throws IOException {
        String oldString = "AAA";
        Question4 question4 = new Question4();
        BufferedReader br = question4.readFromFile();

        System.out.println("Number of identical strings with resourses method realised is: "
                + question4.checkWordWithResourses(oldString));
        System.out.println("Number of identical strings with java6 style method realised is: "
                + question4.checkWord(oldString, br));
    }

    public BufferedReader readFromFile() {
        BufferedReader br;
        try {
            return br = new BufferedReader(new FileReader("C://Users/Димон/Desktop/SoftSkils/ReplaceWords.docx"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is not found");
        }
        return null;
    }

    public int checkWord(String stringToCount, BufferedReader bufferedReader) {
        int countWords = 0;
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {
                    if (stringToCount.equals(s[i])) {
                        countWords++;
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");
        }
        return countWords;
    }

    public int checkWordWithResourses(String stringToCount) {
        int countWords = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C://Users/Димон/Desktop/SoftSkils/ReplaceWords.docx"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {
                    if (stringToCount.equals(s[i])) {
                        countWords++;
                    }
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countWords;
    }
}
