
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class BookApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(sc.nextLine(), sc.nextLine());
        b1.display();
    }
}
