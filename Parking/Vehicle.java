package Parking.Vehicle


class Vehicle {
    private static Set<String> usedPlates = new HashSet<>();
    private String licensePlate;
    private String type;
    private Owner owner;
    private boolean valid = true;

    public Vehicle(String licensePlate, String type, Owner owner) {
        if (usedPlates.contains(licensePlate)) {
            System.out.println("Error: Duplicate license plate '" + licensePlate + "' is not allowed.");
            this.valid = false;
        } else {
            this.licensePlate = licensePlate;
            this.type = type;
            this.owner = owner;
            usedPlates.add(licensePlate);
        }
    }

    public boolean isValid() {
        return valid;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Vehicle shallowCopy() {
        return new Vehicle(licensePlate, type, this.owner);
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(owner.getName());
        return new Vehicle(licensePlate, type, newOwner);
    }

    public void setOwnerName(String newName) {
        owner.name = newName;
    }

    @Override
    public String toString() {
        if (!valid) return "null";
        return "License Plate: " + licensePlate + ", Type: " + type + ", Owner: " + owner;
    }
}
