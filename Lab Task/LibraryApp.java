public class LibraryApp {
    public static void main(String[] args) {
        Address authorAddress = new Address("Defence Road", "Lahore");
        Person author = new Person("Ali", "Author", authorAddress);
        Date publicationDate = new Date(11, 03, 2025);
        Book book = new Book("Macbeth", "900-9", publicationDate, author);
        
        Address inchargeAddress = new Address("Dream Gardens", "Lahore");
        Person incharge = new Person("Ahmed", "Librarian", inchargeAddress);

        Address staffAddress = new Address("DHA", "Karachi");
        Person staff = new Person("Suleman", "Assistant", staffAddress);

        Library library = new Library("GDS Library", book, incharge, staff);
        
        System.out.println(library);
    }
}
