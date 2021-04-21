package tn.alfacomputers.payload.request;

import javax.validation.constraints.NotBlank;

public class ReservationRequest {

    @NotBlank
    private String arrivalDate;

    @NotBlank
    private String departureDate;

    @NotBlank
    private double total;

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
