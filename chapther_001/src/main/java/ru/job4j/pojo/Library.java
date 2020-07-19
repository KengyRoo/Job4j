package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantasy = new Book("Wither", 100);
        Book detective = new Book("Sherlock", 90);
        Book classic = new Book("1q84", 256);
        Book unknown = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = fantasy;
        books[1] = detective;
        books[2] = classic;
        books[3] = unknown;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("Replace 0 and 3.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }

        System.out.println("Выводим только clear code");
        for (int index = 0; index< books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPage());
            }
        }
    }
}
