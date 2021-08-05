package com.controller_spring_boot.controller_point_springboot.model;

import javax.persistence.*;


import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private AccessLevel acessLevel;
    @Column
    private String description;
    
}
