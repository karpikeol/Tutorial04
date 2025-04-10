//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        ReservationSystem system = new ReservationSystem();


        Event concert = new Event("Rock Concert", 120.0, "2025-06-01", "Stadium A");
        concert.setAvailableSeats(100);
        system.addEvent(concert);

        Event artExhibition = new Event("Art Exhibition", 50.0, "2025-07-15", "Gallery B");
        artExhibition.setAvailableSeats(50);
        system.addEvent(artExhibition);


        system.addCustomer("Alice", "Smith", "alice.smith@example.com");
        Customer bob = new Customer("Bob", "Johnson", "bob.johnson@example.com");
        system.addCustomer(bob);


        Customer customerAlice = system.findCustomer("Smith");
        Customer customerBob = system.findCustomer("Johnson");

        Event eventConcert = system.findEvent("Rock Concert");
        Event eventExhibition = system.findEvent("Art Exhibition");


        if (customerAlice != null && eventConcert != null) {
            system.makeReservation(customerAlice, eventConcert);
        }

        if (customerBob != null && eventExhibition != null) {
            system.makeReservation(customerBob, eventExhibition);
        }


        System.out.println("\n=== Customer Reservations ===");
        if (customerAlice != null) {
            customerAlice.displayReservations();
        }
        if (customerBob != null) {
            customerBob.displayReservations();
        }


        System.out.println("\n=== Change Event Price ===");
        system.changeEventPrice("Rock Concert", 150.0);


        System.out.println("\n=== Cancel Reservation ===");
        if (customerBob != null && eventExhibition != null) {
            customerBob.cancelReservation(eventExhibition);
        }


        System.out.println("\n=== Customer Reservations After Cancellation ===");
        if (customerAlice != null) {
            customerAlice.displayReservations();
        }
        if (customerBob != null) {
            customerBob.displayReservations();
        }

    }
}