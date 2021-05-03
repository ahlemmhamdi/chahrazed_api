package tn.alfacomputers.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.alfacomputers.entities.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room,Integer> {

}
