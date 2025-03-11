public class Book {
    private String title;
    private String issn;
    private Date publicationDate;
    private Person author;

    public Book(String title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }

    public Book(Book other) {
        this(other.title, other.issn, other.publicationDate, other.author);
    }

    @Override
    public String toString() {
        return "Book: " + title + " (ISSN: " + issn + ")\nPublished on: " + publicationDate + "\nWritten by: " + author;
    }
}
