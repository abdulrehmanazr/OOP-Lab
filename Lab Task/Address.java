public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address(Address other) {
        this(other.street, other.city);
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}
