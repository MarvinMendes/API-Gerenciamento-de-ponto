package com.gerenciamentodeponto.controle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompTime {


    @Data
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    public class CompTimeId implements Serializable {

        private Long id;

        private Long activityId;

        private Long userId;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private CompTimeId id;

    private LocalDate dateWorked;

    private BigDecimal quantityOfHoursWorked;

    private BigDecimal balanceOfHoursWorked;

}
