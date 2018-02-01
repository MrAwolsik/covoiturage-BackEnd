package fr.ipme.covoit.repository;

import fr.ipme.covoit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
