package tn.alfacomputers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.alfacomputers.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
