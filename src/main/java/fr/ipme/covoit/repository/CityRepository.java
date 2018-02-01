package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

}
