package com.mafro.reserva_system.service;


import com.mafro.reserva_system.domain.entities.Customer;
import com.mafro.reserva_system.domain.entities.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private List<Reservation> reservations = new ArrayList<>();

    private List<Customer> customers = new ArrayList<>();


    //UH1 Como cliente, quiero poder crear una nueva reserva para asegurarme de tener una mesa disponible
    public Reservation createReservation(Reservation reservation) {
        Customer customer = customers.stream()
                .filter(c-> c.getId().equals(reservation.getCustomer().getId()))
                .findFirst().orElseThrow(()-> new RuntimeException("Customer not found"));
        reservation.setCustomer(customer);
        reservation.setId((long) (reservations.size() + 1));
        reservations.add(reservation);
        return reservation;
    }


    public List<Reservation> getAllReservations(){
        return reservations;
    }



}
