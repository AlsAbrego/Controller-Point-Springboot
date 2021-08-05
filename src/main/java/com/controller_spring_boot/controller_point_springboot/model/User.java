package com.controller_spring_boot.controller_point_springboot.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserCategory userCategory;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
    @ManyToOne(fetch = FetchType.LAZY)
    private AccessLevel accessLevel;
    @ManyToOne(fetch = FetchType.LAZY)
    private Workday workday;
    @Column
    private BigDecimal tolerance;
    @Column
    private LocalDateTime startJourney ;
    @Column
    private LocalDateTime endJourney ;    

    


    // @Override
    // public String toString() {
    //     return "User [id=" + id + ", name=" + name + "]";
    // }
    // public long getId() {
    //     return id;
    // }
    // public void setId(long id) {
    //     this.id = id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public User() {
    // }
    // public User(long id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + (int) (id ^ (id >>> 32));
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     return result;
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     User other = (User) obj;
    //     if (id != other.id)
    //         return false;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     return true;
    // }
    


    
}
