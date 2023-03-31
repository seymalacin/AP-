package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingDatesPojo {

    private String checkin;
    private String checkout;

    public BookingDatesPojo() {
    }

    public BookingDatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "BookingDatesPojo{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}



/*
 Yukardakı ıslemler;
 -Boa constructor
 -dolu constructor
 -gettr settr
 -toostriın

 sag tıkla cenerayttan yapılıyo



 */

/*
           Post04
 {

               "bookingdates": {
                   "checkin": "2021-09-21",
                   "checkout": "2021-12-21"
                },

            }
 */