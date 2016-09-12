package module3.task3;
import java.util.Date;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course(new Date(20160901), "mat");
        Course bio = new Course("bio", 15, "Bill");
        Course fiz = new Course("fiz", 10, "Tom");
        Course his = new Course("his", 20, "Andre");
        Course lit = new Course(new Date(20160902), "lit");

        Course[] list1 = {mat, bio, fiz};
        Course[] list2 = {his, lit};

        Student Dima = new Student("Dima", "Zub", 1);
        Student Roma = new Student("Kot", list1);

        CollegeStudent Alex = new CollegeStudent("Alex", "Fish", 1);
        CollegeStudent Gleb = new CollegeStudent("Bariga", list2);
        CollegeStudent Andre = new CollegeStudent("Andre", "Teresch", 1, "NAU", 10, 6669626);

        SpecialStudent Olga = new SpecialStudent("Fox", list1);
        SpecialStudent Inna = new SpecialStudent("Inna", "Cat", 1, "NAU", 15, 644131464);
        SpecialStudent Anna = new SpecialStudent("Anna", "Zub", 1, "NAU", 20, 616641661, 646646464);
    }
}
