package model;

public class Booking {
    private String bookingId;
    private String podId;
    private String username;
    private String slot;

    public Booking(String bookingId, String podId, String username, String slot) {
        setBookingId(bookingId);
        setPodId(podId);
        setUsername(username);
        setSlot(slot);
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getDetails() {
        return "Booking ID: " + getBookingId() + ", Pod: " + getPodId() + ", User: " + getUsername() + ", Slot: " + getSlot();
    }
}
