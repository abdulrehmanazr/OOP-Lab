package Parking.ParkingSystem

class ParkingSystem {
    private static ParkingSystem instance;
    private String campusName;
    private Supervisor supervisor;
    private List<ParkingZone> zones;
    private List<PermitHolder> holders;

    private ParkingSystem(String campusName, Supervisor supervisor) {
        this.campusName = campusName;
        this.supervisor = supervisor;
        this.zones = new ArrayList<>();
        this.holders = new ArrayList<>();
    }

    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(campusName, supervisor);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone zone) {
        zones.add(zone);
    }

    public void addPermitHolder(PermitHolder holder) {
        holders.add(holder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus: ").append(campusName).append("\n");
        sb.append(supervisor).append("\n");
        sb.append("Zones:\n");
        for (ParkingZone z : zones) sb.append(z);
        sb.append("Permit Holders: [");
        for (int i = 0; i < holders.size(); i++) {
            sb.append(holders.get(i));
            if (i < holders.size() - 1) sb.append(", ");
        }
        sb.append("]\n");
        return sb.toString();
    }
}