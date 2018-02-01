package fr.ipme.covoit.controller;


import fr.ipme.covoit.model.City;
import fr.ipme.covoit.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository repository;

    //List

    @GetMapping
    public List<City> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public City get(@PathVariable int id) {
        return repository.getOne(id);
    }

    //Post

    @PostMapping
    public City create(@RequestBody City city){
        City createdCity = repository.save(city);
        return createdCity;
    }

    //Update

    @PutMapping("/{id}")
    public City update(@PathVariable int id, @RequestBody City city) {
        City savedCity = repository.getOne(id);
        if (savedCity != null) {
            city.setId(savedCity.getId());
            savedCity = repository.save(city);
        }
        return savedCity;
    }

    //Delete

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repository.delete(id);
    }
}
