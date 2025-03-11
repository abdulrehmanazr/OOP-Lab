public class Library {
    private String name;
    private Book book;
    private Person incharge;
    private Person staff;

    public Library(String name, Book book, Person incharge, Person staff) {
        this.name = name;
        this.book = new Book(book);
        this.incharge = new Person(incharge);
        this.staff = new Person(staff);
    }

    public String getName() { 
    return name; 
    }

    @Override
    public String toString() {
        return "Library: " + name + "\n" + book + "\nIncharge: " + incharge + "\nStaff: " + staff;
    }
}
