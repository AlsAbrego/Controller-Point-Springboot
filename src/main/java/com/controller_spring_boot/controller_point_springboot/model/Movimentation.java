package com.controller_spring_boot.controller_point_springboot.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;


import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentationID implements Serializable{
        @Column
        private long idMovimentation;
        @Column
        private long idUser;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private MovimentationID id;    
    @Column
    private LocalDateTime entryDate;
    @Column
    private LocalDateTime departureDate;
    @Column
    private BigDecimal stayingTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;
    @ManyToOne(fetch = FetchType.LAZY)
    private Calendar calendar;
}
