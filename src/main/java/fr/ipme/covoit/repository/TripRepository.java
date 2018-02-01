package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {

}
