package com.controller_spring_boot.controller_point_springboot.services;

import java.util.List;
import java.util.Optional;

import com.controller_spring_boot.controller_point_springboot.Repository.WorkDayRepository;
import com.controller_spring_boot.controller_point_springboot.model.Workday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkDayServices {
    
    @Autowired
    private WorkDayRepository workDayRepository;

    public Workday saveWorkday(Workday workday) {
       return workDayRepository.save(workday);
    }

    public List<Workday> findAll() {
        return workDayRepository.findAll();
    }

    public Optional<Workday> getById(Long idWorkday) {
        return workDayRepository.findById(idWorkday);
    }

    public Workday updateWorkday(Workday workday) {
        return workDayRepository.save(workday);
     }

     public void deleteWorkday(Long idWorkday) {
        workDayRepository.deleteById(idWorkday);
    }

}
