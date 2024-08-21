package com.mafro.reserva_system.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Para construir objetos de una clase
public class Customer {
    private Long id;
    private String name;
    private String address;
    private String phone;

}
