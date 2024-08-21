package com.mafro.reserva_system.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation
{

    private Long id;
    private LocalDate reservationDate;
    private int numberOfPeople;
    private Customer customer;




}
