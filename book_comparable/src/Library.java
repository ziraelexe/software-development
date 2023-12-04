import java.util.*;

public class Library {

    public static void main(String[] args) {
        // Using HashSet
        Set<Book> bookSet = new HashSet<>();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 200);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 30);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 425);

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        System.out.println("Books in HashSet:");
        for (Book book : bookSet) {
            System.out.println(book);
        }

        System.out.println();

        // Using TreeSet with Comparator
        Set<Book> bookTreeSet = new TreeSet<>(new AuthorComparator());

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);

        System.out.println("Books in TreeSet (sorted by author):");
        for (Book book : bookTreeSet) {
            System.out.println(book);
        }

        System.out.println();

        Set<Book> sortedBookTreeSet = new TreeSet<>(new PagesComparator());

        sortedBookTreeSet.add(book1);
        sortedBookTreeSet.add(book2);
        sortedBookTreeSet.add(book3);

        System.out.println("Books in TreeSet (sorted by pages in descending order):");
        for (Book book : sortedBookTreeSet) {
            System.out.println(book);
        }
    }
}

class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}

class PagesComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book2.getPages(), book1.getPages());
    }
}
