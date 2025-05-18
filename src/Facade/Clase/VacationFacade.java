package Facade.Clase;

public class VacationFacade {
    public String bookVacation(String destination, String date, int nights){
        return FlightBooking.bookFlight(date, destination) + "\n" + HotelBooking.bookHotel(date, nights) + "\n" + CarRental.rentCar(date, nights+1);
    }
}
