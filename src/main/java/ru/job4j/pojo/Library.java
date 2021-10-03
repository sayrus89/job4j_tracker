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
        for (Book bok : books) {
            Book bk = bok;
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "pages");
        }
        System.out.println();
        System.out.println("Rearrange books:");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book bok : books) {
            Book bk = bok;
            System.out.println(bk.getName() + " - " + bk.getPages() + " " + "pages");
        }
        System.out.println();
        System.out.println("Bring out a book called - Clean code");
        for (Book bok : books) {
            Book bk = bok;
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName());
            }
        }
    }
}
