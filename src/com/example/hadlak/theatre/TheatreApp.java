package com.example.hadlak.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheatreApp {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Colosseum", 3, 5);
        theatre.printSeats();

        theatre.reserveSeat("D01");
        theatre.reserveSeat("A01");
        theatre.reserveSeat("A01");
        theatre.reserveSeat("B05");
        theatre.reserveSeat("B06");
        theatre.reserveSeat("D01");
        theatre.cancelSeat("D01");
        theatre.cancelSeat("A01");
        theatre.cancelSeat("A01");

        List<Theatre.Seat> seatCopy = List.copyOf(theatre.getSeats());
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.print("Please pay for A02");
        } else {
            System.out.print("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        printList(seatCopy);
        printList(theatre.getSeats());

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number: " + minSeat.getSeatNumber());
        System.out.println("Max seat number: " + maxSeat.getSeatNumber());

//        sortList(seatCopy);
        Collections.sort(seatCopy);
        printList(seatCopy);

        List<Theatre.Seat> newList = new ArrayList<>(theatre.getSeats().size());
        Collections.copy(newList, theatre.getSeats());
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================");
    }

    // can be used when speed is not so important but memory is
    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i < list.size() -1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
