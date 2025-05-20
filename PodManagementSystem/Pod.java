package model;

import java.util.*;

public class Pod {
    private String podId;
    private int capacity;
    private List<String> availableSlots;

    public Pod(String podId, int capacity) {
        setPodId(podId);
        setCapacity(capacity);
        this.availableSlots = new ArrayList<>();
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String getPodId() {
        return podId;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void addSlot(String slot) {
        if (!availableSlots.contains(slot)) {
            availableSlots.add(slot);
        }
    }

    public boolean isSlotAvailable(String slot) {
        return availableSlots.contains(slot);
    }

    public void bookSlot(String slot) {
        availableSlots.remove(slot); // if it's booked, remove from available
    }


}
