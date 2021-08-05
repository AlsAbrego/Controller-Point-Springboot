package com.controller_spring_boot.controller_point_springboot.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String descriptrion;
    @Column
    private String cnpj;
    @Column
    private String address;
    @Column
    private String district;
    @Column
    private String city;
    @Column
    private String state;
}
