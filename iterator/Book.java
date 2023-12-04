import java.util.Objects;

public final class Book {
    private final String title;
    private final String author;
    private final String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    public String ISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Book) obj;
        return Objects.equals(this.title, that.title) &&
                Objects.equals(this.author, that.author) &&
                Objects.equals(this.ISBN, that.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, ISBN);
    }

    @Override
    public String toString() {
        return "Book[" +
                "title=" + title + ", " +
                "author=" + author + ", " +
                "ISBN=" + ISBN + ']';
    }


}
