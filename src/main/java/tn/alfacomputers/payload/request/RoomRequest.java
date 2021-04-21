package tn.alfacomputers.payload.request;

import javax.validation.constraints.NotBlank;

public class RoomRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private Integer price;

    @NotBlank
    private String hotel;

    @NotBlank
    private String photo_url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }


    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }
}
