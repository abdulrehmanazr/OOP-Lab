package Parking.ParkingZone

class ParkingZone {
    private static int counter = 1;
    private String zoneID;
    private Vehicle[] vehicles;
    private int count = 0;

    public ParkingZone() {
        this.zoneID = "Z" + counter++;
        this.vehicles = new Vehicle[5];
    }

    public void addVehicle(Vehicle v) {
        if (v.isValid() && count < vehicles.length) {
            vehicles[count++] = v;
        } else if (!v.isValid()) {
            vehicles[count++] = null; // reserve space for display alignment
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zone ID: ").append(zoneID).append(", Vehicles: [");
        for (int i = 0; i < 5; i++) {
            if (i < count && vehicles[i] != null) {
                sb.append(vehicles[i]);
            } else {
                sb.append("null");
            }
            if (i < 4) sb.append(", ");
        }
        sb.append("]\n");
        return sb.toString();
    }
}
