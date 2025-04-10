import java.util.ArrayList;

public class Customer {
    private String firstname;
    private String lastname;

    private String email;

    private  ArrayList<Event>  reservationList = new ArrayList<>();


    public Customer(String first, String last) {
        this.firstname = first;
        this.lastname = last;
    }

    public Customer(String first, String last, String email) {
        this.firstname = first;
        this.lastname = last;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Event> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Event> reservationList) {
        this.reservationList = reservationList;
    }

    public boolean addReservation(Event event){
            if(event.reserveSeat()){
                reservationList.add(event);
                return true ;

        }else{
                System.out.println("There is no available seats for event: "+event.getName());
                return false;
            }
    }

    public void cancelReservation(Event event){
        if (reservationList.contains(event)){
            reservationList.remove(event);
            event.setAvailableSeats(event.getAvailableSeats()+1);
            System.out.println("Reservation for event " +event.getName() + " canceled");
        }else{
            System.out.println(" no such reservation found");
        }
    }

    public void displayReservations() {
        if(reservationList.isEmpty()){
            System.out.println(firstname+ " has no reservations");
        }else{
            System.out.println("Reservations: ");
            for(Event event : reservationList){
                System.out.println(event);
            }
        }
    }


}
