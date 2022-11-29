package com.javaschool.railway.service;

import com.javaschool.railway.entity.Passenger;
import com.javaschool.railway.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    //GET BY ID
    public Passenger findById(Integer id) {
        Optional<Passenger> result = null;
        result = passengerRepository.findById(id);
        if(result.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (result.get());
    }

    //GET ALL ITEMS
    public List<Passenger> findAll() throws NoSuchElementException {
        List<Passenger> result = null;
        result = passengerRepository.findAll();
        if (result.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return (result);
        }
    }

    //POST NEW ITEM
    public Passenger create(Passenger passenger) throws IllegalArgumentException{
        Passenger result = null;
        if(passenger.getFirstName() != null && passenger.getLastName() != null && passenger.getEmail() != null &&
                passenger.getBirthDate() != null && passenger.getMobilePhone() != null) {
            result = passengerRepository.save(passenger);
            return(result);
        }else {
                throw new IllegalArgumentException();
            }
    }

    //UPDATE BY ID
    public Passenger updateById(Integer id, Passenger passenger) throws NoSuchElementException, IllegalArgumentException {
        Optional<Passenger> test = passengerRepository.findById(id);
        if (test.isEmpty()) {
            throw new NoSuchElementException();
        }

        if (passenger.getFirstName() != null)
            test.get().setFirstName(passenger.getFirstName());
        if (passenger.getLastName() != null)
            test.get().setLastName(passenger.getLastName());
        if (passenger.getBirthDate() != null)
            test.get().setBirthDate(passenger.getBirthDate());
        if (passenger.getEmail() != null)
            test.get().setEmail(passenger.getEmail());
        if (passenger.getMobilePhone() != null)
            test.get().setMobilePhone(passenger.getMobilePhone());

        Passenger result = passengerRepository.save(test.get());
        return (result);
    }

    //DELETE BY ID
    public Passenger deleteById(Integer id) throws NoSuchElementException{
        Optional<Passenger> test = passengerRepository.findById(id);
        if(test.isEmpty()) {
            throw new NoSuchElementException();
        }
        passengerRepository.deleteById(id);
        return (test.get());
    }



}

