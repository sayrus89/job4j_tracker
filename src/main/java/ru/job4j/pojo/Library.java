package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 464);
        Book javaHeadFirst = new Book("Java Head First", 688);
        Book javaCore = new Book("Java Core", 866);
        Book javaThinking = new Book("Java Thinking", 1150);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaHeadFirst;
        books[2] = javaCore;
        books[3] = javaThinking;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "pages");
        }
        System.out.println();
        System.out.println("Rearrange books:");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "pages");
        }
        System.out.println();
        System.out.println("Bring out a book called - Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (books[index] == cleanCode) {
                System.out.println(bk.getName());
            }
        }
    }
}
