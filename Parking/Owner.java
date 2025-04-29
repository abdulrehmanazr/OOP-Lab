package Parking.Owner
import Parking.Person

class Owner extends Person {
    private static int idCounter = 1;
    private String ownerId;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("O%03d", idCounter++);
    }

    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Owner ID: " + ownerId + "]";
    }
}