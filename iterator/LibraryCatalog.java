import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LibraryCatalog extends LinkedList<Book> implements Iterable<Book> {

    private final LinkedList<Book> books;

    public LibraryCatalog() {
        books = new LinkedList<>();
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library catalogue is empty!");
        }
        System.out.println("Library catalogue:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.title().equals(title)) {
                System.out.println("Book found " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books with the title " + title);
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;

        for (Book book : books) {
            if (book.author().equals(author)) {
                System.out.println("Book found with this author " + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book with this author found ");
        }
    }

    public Iterator<Book> iterator() {
        return books.iterator();
    }

    private class LibraryCatalogueIterator implements Iterator<Book> {

        private final int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There is no more books in the catalogue!");
            }
            return books.get(index);
        }
    }

}
