package com.gerenciamentodeponto.controle.domain;


import com.gerenciamentodeponto.controle.enums.City;
import com.gerenciamentodeponto.controle.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private Integer number;

    private String neighborhood;

    @Enumerated(value = EnumType.STRING)
    private City city;

    @Enumerated(value = EnumType.STRING)
    private State state;

}
