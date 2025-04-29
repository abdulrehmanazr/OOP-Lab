package Parking.Supervisor
import Parking.Person

class Supervisor extends Person {
    private int yearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Supervisor: Name: " + name + ", Experience: " + yearsOfExperience + " years";
    }
}