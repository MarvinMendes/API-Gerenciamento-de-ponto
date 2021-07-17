package com.gerenciamentodeponto.controle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

    @Data
    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    public class ActivityId implements Serializable {

        private Long id;

        private Long userId;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ActivityId id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime timeExpend;

    @ManyToOne
    private Event code;

    @ManyToOne
    private Schedule especialDate;

}
