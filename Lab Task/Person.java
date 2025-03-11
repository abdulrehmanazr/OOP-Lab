public class Person {
    private String name;
    private String role;
    private Address address;

    public Person(String name, String role, Address address) {
        this.name = name;
        this.role = role;
        this.address = new Address(address);
    }

    public Person(Person other) {
        this(other.name, other.role, other.address);
    }

    @Override
    public String toString() {
        return name + " (" + role + "), Address: " + address;
    }
}
