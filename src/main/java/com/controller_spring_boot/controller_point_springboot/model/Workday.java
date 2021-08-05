package com.controller_spring_boot.controller_point_springboot.model;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database auto-generate the product(workday) ID")
    private long id;
    @Column
    @ApiModelProperty(notes = "The product description")
    private String description; 
}
