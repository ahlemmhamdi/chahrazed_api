package tn.alfacomputers.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.alfacomputers.entities.Room;
import tn.alfacomputers.repositories.RoomRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/api/v1/rooms")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;
    @PostMapping(path="/addroom")
    public @ResponseBody
    String addNewRoom (
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

//TODO: to fix null value of photo_url when wee submit new room
