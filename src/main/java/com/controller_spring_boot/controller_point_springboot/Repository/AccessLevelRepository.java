package com.controller_spring_boot.controller_point_springboot.Repository;

import com.controller_spring_boot.controller_point_springboot.model.AccessLevel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessLevelRepository extends JpaRepository<AccessLevel, Long>{
    
}
