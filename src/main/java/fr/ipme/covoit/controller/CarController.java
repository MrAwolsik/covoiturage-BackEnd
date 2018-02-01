package fr.ipme.covoit.controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.ipme.covoit.model.Car;
import fr.ipme.covoit.model.View;
import fr.ipme.covoit.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    //List

    @GetMapping
    @JsonView(View.Car.class)
    public List<Car> list () {

        return repository.findAll();
    }

    //Get

    @GetMapping("/{id}")
    @JsonView(View.Car.class)
    public Car get(@PathVariable int id) {
        return repository.getOne(id);
    }

    //Create

    @PostMapping
    public Car create(@RequestBody Car car) {
        Car createdCar = repository.save(car);
        return createdCar;
    }

    //Update

    @PutMapping("/{id}")
    public Car update(@PathVariable int id, @RequestBody Car car) {
        Car savedCar = repository.getOne(id);
        if (savedCar != null) {
            car.setId(savedCar.getId());
            savedCar = repository.save(car);
        }
        return savedCar;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }
}
