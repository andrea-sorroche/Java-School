package com.javaschool.railway.controller;

import com.javaschool.railway.entity.Station;
import com.javaschool.railway.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {
    @Autowired
    private StationService service;

    //EMPTY CALL
    @GetMapping("")
    String simpleResponse() {
        return("Empty call");
    }

    //GET ALL
    @GetMapping("/all")
    public ResponseEntity<List<Station>> getAllStations(){
        List<Station> stations = service.findAll();
        return new ResponseEntity<>(stations, HttpStatus.OK);
    }

    //GET BY ID
    @GetMapping("/find/{id}")
    public ResponseEntity<Station> getById(@PathVariable("id") Integer id){
        Station station = service.findById(id);
        return new ResponseEntity<>(station, HttpStatus.OK);
    }

    //POST NEW ITEM
    @PostMapping("/add")
    public  ResponseEntity<Station> addStation(@RequestBody Station station){
        Station newStation = service.create(station);
        return new ResponseEntity<>(newStation, HttpStatus.CREATED);
    }

    //UPDATE BY ID
    @PutMapping("/update")
    public  ResponseEntity<Station> updateById(@RequestBody Station station){
        Station updateStation = service.updateById(station.getId(), station);
        return new ResponseEntity<>(updateStation, HttpStatus.OK);
    }

    //DELETE BY ID
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
