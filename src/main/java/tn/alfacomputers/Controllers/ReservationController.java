package tn.alfacomputers.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.alfacomputers.entities.Reservation;
import tn.alfacomputers.repositories.ReservationRepository;

@Controller
@RequestMapping("/api/v1/reservations")
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping(path = "/addreservations")
    public @ResponseBody
    String addNewUser(
            @RequestBody Reservation reservation) {


        Reservation r = new Reservation();
        r.setArrivalDate(reservation.getArrivalDate());
        r.setDepartureDate(reservation.getDepartureDate());
        r.setTotal(reservation.getTotal());
        reservationRepository.save(r);
        return "Room Successfully added :)";
    }

    @GetMapping(path = "/getreservation")
    public @ResponseBody
    Iterable<Reservation> getAllRooms() {

        return reservationRepository.findAll();
    }
}

