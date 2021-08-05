package com.controller_spring_boot.controller_point_springboot.controller;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.constraints.Min;

import com.controller_spring_boot.controller_point_springboot.model.Workday;
import com.controller_spring_boot.controller_point_springboot.services.WorkDayServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/workday")
public class WorkdayController {

    @Autowired
    private WorkDayServices workDayServices;

    @ApiOperation(value = "Creating/Sending data to database through POST request", response = Iterable.class)
    @PostMapping
    public Workday createWorkDay(@RequestBody Workday workday) {
        return workDayServices.saveWorkday(workday);
    }

    @ApiOperation(value = "View a List of avaliable worday", response = Iterable.class)
    @GetMapping
    public List<Workday> getWorkDayList() {
        return workDayServices.findAll();
    }

    //I didn't used in the others request Operation (Get/Put/Delete) the notation ApiOperation from swagger, to avoid confusion
    @GetMapping("/{idWorkday}")
    public ResponseEntity<Workday>  getWorkDayByID(@PathVariable("idWorkday") long idWorkday) throws Exception {
        return ResponseEntity.ok(workDayServices.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Worday with id: " + idWorkday + " was NOT FOUND"))) ;
    }

    @PutMapping
    public Workday updateWorkday(@RequestBody Workday workday) {
        return workDayServices.updateWorkday(workday);
    }

    @DeleteMapping("/{idWorkday}")
    public ResponseEntity<String> deleteWorkday(@PathVariable("idWorkday") @Min(1) long idWorkday) {
        Workday workday = workDayServices.getById(idWorkday).orElseThrow(() -> new NoSuchElementException("Worday with id: " + idWorkday + " was NOT FOUND"));
        workDayServices.deleteWorkday(workday.getId());
        return ResponseEntity.ok().body("Workday " + workday.getDescription() + " with ID: " + workday.getId() + " was deleted with success!");
    }



    
    
}
