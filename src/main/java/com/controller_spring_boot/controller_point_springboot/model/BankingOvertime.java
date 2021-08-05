package com.controller_spring_boot.controller_point_springboot.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;


import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankingOvertime {
    
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BankingOvertimeID implements Serializable{
        @Column
        private long idBankingOvertime;
        @Column
        private long idMovimentation;
        @Column
        private long idUser;        
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private BankingOvertimeID id;

    @Column
    private LocalDateTime workingDate;
    @Column
    private BigDecimal amountHours;
    @Column
    private BigDecimal Balance;      
}
