package com.controller_spring_boot.controller_point_springboot.model;



import java.time.LocalDateTime;

import javax.persistence.*;
import javax.persistence.ManyToOne;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calendar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private DataType dataType;
    @Column
    private String description;
    @Column
    private LocalDateTime specialDate;
    
}
