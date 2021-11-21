package ru.skypro;

public class Main {

    public static void main(String[] args) {


        Author dreiser = new Author("Theodore", "Dreiser");
        Author dreiser2 = new Author("Theodore", "Dreiser");
        Author bulgakov = new Author("Mikhail", "Bulgakov");

        System.out.println("Сравниваем одинаковых авторов с помощью equals: " + dreiser.equals(dreiser2));
        System.out.println("Сравниваем одинаковых авторов с помощью hashCode: " + (dreiser.hashCode() == dreiser2.hashCode()));
        System.out.println("Сравниваем разных авторов с помощью equals: " + bulgakov.equals(dreiser2));
        System.out.println("Сравниваем разных авторов с помощью hashCode: " + (dreiser.hashCode() == bulgakov.hashCode()));
        System.out.println(dreiser);
        System.out.println(bulgakov);


        Book theWhiteGuard = new Book(bulgakov, "The White Guard", 2008);
        Book theWhiteGuard2 = new Book(bulgakov, "The White Guard", 2008);
        Book titan = new Book(dreiser, "Titan", 2016);

        System.out.println("Сравниваем одинаковые книги с помощью equals: " + theWhiteGuard.equals(theWhiteGuard2));
        System.out.println("Сравниваем одинаковые книги с помощью hashCode: " + (theWhiteGuard.hashCode() == theWhiteGuard2.hashCode()));
        System.out.println("Сравниваем разные книги с помощью equals: " + theWhiteGuard.equals(theWhiteGuard));
        System.out.println("Сравниваем разные книги с помощью hashCode: " + (theWhiteGuard.hashCode() == titan.hashCode()));

        System.out.println(theWhiteGuard);
        System.out.println(titan);
    }
}
