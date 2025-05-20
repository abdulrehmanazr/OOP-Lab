package service;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public boolean bookSlot(User user, Pod pod, String slot) {
        if (!pod.isSlotAvailable(slot))
            return false;

        pod.bookSlot(slot);
        bookings.add(new Booking(UUID.randomUUID().toString(), pod.getPodId(), user.getUsername(), slot));
        return true;
    }

    public List<Booking> getBookingsForUser(String username) {
        List<Booking> list = new ArrayList<>();
        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            if (b.getDetails().contains(username)) {
                list.add(b);
            }
        }

        return list;
    }
}

