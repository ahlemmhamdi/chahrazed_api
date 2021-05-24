package tn.alfacomputers.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.alfacomputers.entities.Reservation;
import tn.alfacomputers.entities.Room;
import tn.alfacomputers.repositories.ReservationRepository;

@Controller
@RequestMapping("/api/v1/reservations")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping(path = "/addreservation/{userId}/{roomId}")
    public @ResponseBody
    String addNewReservation(
            @RequestParam Long userId,
            @RequestParam Integer roomId,
            @RequestBody Reservation reservation) {


        Reservation r = new Reservation();
        r.setArrivalDate(reservation.getArrivalDate());
        r.setDepartureDate(reservation.getDepartureDate());
        r.setTotal(reservation.getTotal());
        r.setRoom(new Room(roomId);
        r.setUser(reservation.getUser());
        reservationRepository.save(r);
        return "Reservation Successfully added :)";
    }

    @GetMapping(path = "/getreservation")
    public @ResponseBody
    Iterable<Reservation> getAllReservations() {

        return reservationRepository.findAll();
    }
}

