package com.controller_spring_boot.controller_point_springboot.repository;

import com.controller_spring_boot.controller_point_springboot.model.Workday;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDayRepository extends JpaRepository<Workday, Long>{
    
}
