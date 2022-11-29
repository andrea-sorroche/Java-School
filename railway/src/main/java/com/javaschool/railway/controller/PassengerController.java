package com.javaschool.railway.controller;

import com.javaschool.railway.entity.Passenger;
import com.javaschool.railway.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService service;

    //EMPTY CALL
    @GetMapping("")
    String simpleResponse() {
        return("Empty call");
    }

    //GET ALL
    @GetMapping("/all")
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        List<Passenger> passengers = service.findAll();
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }

    //GET BY ID
    @GetMapping("/find/{id}")
    public ResponseEntity<Passenger> getById(@PathVariable("id") Integer id){
        Passenger passenger = service.findById(id);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }

    //POST NEW ITEM
    @PostMapping("/add")
    public  ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger){
        Passenger newPassenger = service.create(passenger);
        return new ResponseEntity<>(newPassenger, HttpStatus.CREATED);
    }

    //UPDATE BY ID
    @PutMapping("/update")
    public  ResponseEntity<Passenger> updateById(@RequestBody Passenger passenger){
        Passenger updatePassenger = service.updateById(passenger.getId(), passenger);
        return new ResponseEntity<>(updatePassenger, HttpStatus.OK);
    }

    //DELETE BY ID
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
