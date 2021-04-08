package tn.alfacomputers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.alfacomputers.entities.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Integer> {


}
