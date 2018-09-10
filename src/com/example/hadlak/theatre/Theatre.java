package com.example.hadlak.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public void printSeats() {
        for (Seat s : seats) {
            System.out.print(s.getSeatNumber() + " ");
        }
        System.out.println("\n");
    }

    public String getTheatreName() {
        return theatreName;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        System.out.println("found seat: " + foundSeat);

        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("seat number " + seatNumber + " not available");
            return false;
        }
    }

    public boolean cancelSeat(String seatNumber) {
        Seat canceledSeat = null;
        for (Seat s : seats) {
            if (s.getSeatNumber().equals(seatNumber)) {
                canceledSeat = s;
                break;
            }
        }
        if (canceledSeat == null) {
            System.out.println("seat number " + seatNumber + " not available");
            return false;
        } else {
            return canceledSeat.cancel();
        }
    }

    class Seat implements Comparable<Seat> {

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }

        public boolean reserve() {
            if (!reserved) {
                System.out.println(seatNumber + " reserved");
                return reserved = true;
            } else {
                System.out.println(seatNumber + " is already reserved");
                return false;
            }
        }

        public boolean cancel() {
            if (reserved) {
                System.out.println(seatNumber + " canceled");
                return !(reserved = false);
            } else {
                System.out.println(seatNumber + " wasn't reserved yet.");
                return false;
            }
        }

        public boolean isReserved() {
            return reserved;
        }


        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }
    }
}
