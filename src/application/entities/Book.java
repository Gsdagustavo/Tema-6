package application.entities;

public class Book {

    // Attributes
    private String bookName, authorName, publisherName;
    private int releaseYear, pageNumber, isbn;
    private float value;

    // Constructor
    public Book(String bookName, String authorName, String publisherName, int releaseYear, int pageNumber, int isbn, float value) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.releaseYear = releaseYear;
        this.pageNumber = pageNumber;
        this.isbn = isbn;
        this.value = value;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getIsbn() {
        return isbn;
    }

    public float getValue() {
        return value;
    }

    // toString
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", releaseYear=" + releaseYear +
                ", pageNumber=" + pageNumber +
                ", isbn=" + isbn +
                ", value=" + value +
                '}';
    }
}
