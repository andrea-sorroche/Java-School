package com.javaschool.railway.service;

import com.javaschool.railway.entity.Passenger;
import com.javaschool.railway.entity.Station;
import com.javaschool.railway.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StationService {

    @Autowired
    StationRepository stationRepository;

    //GET BY ID
    public Station findById(Integer id) {
        Optional<Station> result = null;
        result = stationRepository.findById(id);
        if(result.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (result.get());
    }

    //GET ALL ITEMS
    public List<Station> findAll() throws NoSuchElementException {
        List<Station> result = null;
        result = stationRepository.findAll();
        if (result.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return (result);
        }
    }

    //POST NEW ITEM
    public Station create(Station station) throws IllegalArgumentException{
        Station result = null;
        if(station.getName() != null && station.isClosed() != null && station.getStopDuration() != null) {
            result = stationRepository.save(station);
            return(result);
        }else {
            throw new IllegalArgumentException();
        }
    }

    //UPDATE BY ID
    public Station updateById(Integer id, Station station) throws NoSuchElementException, IllegalArgumentException {
        Optional<Station> test = stationRepository.findById(id);
        if (test.isEmpty()) {
            throw new NoSuchElementException();
        }

        if (station.getName() != null)
            test.get().setName(station.getName());
        if (station.getStopDuration()!= null)
            test.get().setStopDuration(station.getStopDuration());
        if (station.isClosed()!= null)
            test.get().setClosed(station.isClosed());

        Station result = stationRepository.save(test.get());
        return (result);
    }

    //DELETE BY ID
    public Station deleteById(Integer id) throws NoSuchElementException{
        Optional<Station> test = stationRepository.findById(id);
        if(test.isEmpty()) {
            throw new NoSuchElementException();
        }
        stationRepository.deleteById(id);
        return (test.get());
    }
}
