package Lesson3.Zadanie1;
import java.util.*;

public class Main {

    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Book", "Thief", "Pain", "Animal", "Bottle",
                "Sushi", "Lesson", "Sea Battle", "Sea", "Sun",
                "Bottle", "Mirror", "Sea Battle", "Elder Titan", "Sushi",
                "Cat", "Human", "Water", "Pain", "Phone"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Initial array");
        System.out.println(words.toString());
        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println("frequency of words appearing");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}