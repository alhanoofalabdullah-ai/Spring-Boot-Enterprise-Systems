package com.alhanoof.hotel.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @GetMapping
    public String getReservations() {
        return "Reservations Retrieved Successfully";
    }

    @PostMapping
    public String createReservation() {
        return "Reservation Created Successfully";
    }

    @PutMapping("/{id}")
    public String updateReservation(
            @PathVariable Long id
    ) {
        return "Reservation Updated Successfully";
    }

    @DeleteMapping("/{id}")
    public String cancelReservation(
            @PathVariable Long id
    ) {
        return "Reservation Cancelled Successfully";
    }
}
