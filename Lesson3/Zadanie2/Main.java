package Lesson3.Zadanie2;

public class Main {
    public static void main(String[] args){
        System.out.println("Create our phonebook");
        Phonebook phonebook = new Phonebook();
        System.out.println();

        System.out.println("Filling in our phonebook");
        phonebook.add("Kozlov", "27260398");
        phonebook.add("Kozlov", "26270397");
        phonebook.add("Andreev", "25260413");
        phonebook.add("Kiselev", "23241676");
        phonebook.add("Kozlov", "21220887");
        System.out.println();

        System.out.println("Get Numbers");
        System.out.println("Kozlov");
        System.out.println(phonebook.get("Kozlov"));
        System.out.println("Andreev");
        System.out.println(phonebook.get("Andreev"));
        System.out.println("Kiselev");
        System.out.println(phonebook.get("Kiselev"));
        System.out.println();

        System.out.println("absence case");
        System.out.println("Mirov");
        System.out.println(phonebook.get("Mirov"));
        System.out.println();

        System.out.println("Already existing number");
        phonebook.add("Kozlov", "223344");
        System.out.println("Kozlov");
        System.out.println(phonebook.get("Kozlov"));
    }
}
