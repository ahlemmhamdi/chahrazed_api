package tn.alfacomputers.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.alfacomputers.entities.Room;
import tn.alfacomputers.repositories.RoomRepository;

@Controller
@RequestMapping("/api/v1/rooms")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;
    @PostMapping(path="/addrooms")
    public @ResponseBody
    String addNewUser (
            @RequestBody Room room) {


        Room r = new Room();
        r.setTitle(room.getTitle());
        r.setDescription(room.getDescription());
        r.setPrice(room.getPrice());
        r.setHotel(room.getHotel());
        roomRepository.save(r);
        return "Room Successfully added :)";
    }

    @GetMapping(path="/getroom")
    public @ResponseBody Iterable<Room> getAllRooms() {

        return roomRepository.findAll();
    }
}
