package reservation;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy{

    String[] dOW = {"MON", "TUE","WED", "THU", "FRI", "SAT", "SUN"};
    List<String> bookingCodes = new ArrayList<>();
    int nOfResevations;

    public Reservation(int nOfResevations){

        this.nOfResevations = nOfResevations;

    }

    public static void main(String[] args) {

        Reservation booking = new Reservation(10);
        int number = booking.getnOfResevations();
        booking.fillReservations(number);
        booking.showBookings();


    }

    public void fillReservations(int number){

        String code;
        for (int i = 0; i < number; i++) {
            code = getCodeBooking();
            addCode(code);
        }
    }

    /*public String randomCode(){

        String code = "";
        String baseCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < 8; i++) {

            int index = (int)(1 +(Math.random()* 35));
            code += baseCharacters.charAt(index);

        }

        return code;
    }*/

    public int getnOfResevations(){
        return nOfResevations;
    }

    public void addCode(String code){
        bookingCodes.add(code);
    }

    public void showBookings(){

        for (int i = 0; i < bookingCodes.size(); i++) {

            System.out.println("Booking# " + bookingCodes.get(i) + " for " + getDowBooking());

        }

    }

    @Override
    public String getDowBooking() {

        int index = (int)(1 +(Math.random()* 6));
        return dOW[index];
    }

    @Override
    public String getCodeBooking() {

        String code = "";
        String baseCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < 8; i++) {

            int index = (int)(1 +(Math.random()* 35));
            code += baseCharacters.charAt(index);

        }
        return code;
    }
}
