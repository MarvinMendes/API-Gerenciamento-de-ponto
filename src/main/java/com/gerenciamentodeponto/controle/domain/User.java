package com.gerenciamentodeponto.controle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserCategory category;

    private String name;

    @ManyToOne
    private Company codeCompany;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private WorkingDay journey;

    private BigDecimal forbearance;

    private LocalDateTime startOfTheJourney;

    private LocalDateTime endOfTheJourney;

}
