package Parking.PermitHolder
import Parking.Person

class PermitHolder extends Person {
    private static int idCounter = 1000;
    private int permitID;

    public PermitHolder(String name) {
        super(name);
        this.permitID = idCounter++;
    }

    public int getPermitID() {
        return permitID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof PermitHolder) {
            return this.permitID == ((PermitHolder) obj).permitID;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Permit ID: " + permitID;
    }
}