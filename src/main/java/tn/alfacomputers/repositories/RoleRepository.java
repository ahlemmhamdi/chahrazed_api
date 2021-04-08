package tn.alfacomputers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.alfacomputers.entities.ERole;
import tn.alfacomputers.entities.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}
