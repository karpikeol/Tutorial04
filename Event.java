public class Event {
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats = 100;

    private  int availableSeats =0;
    private  double price;

    public Event(String name, double price){
        this.name = name;
        this.price = price;

    }

    public Event(String name, double price, String date){
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public Event(String name, double price, String date, String location){
        this.name = name;
        this.price = price;
        this.date = date;
        this.location = location;
    }




    public int getAvailableSeats() {
            return availableSeats;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
   public String toString() {
      return "Event{name='" + name + "', date='" + date + "', location='" + location + "', availableSeats=" + availableSeats + ", price=" + price + "}";
    }



    public boolean  reserveSeat(){
        if(availableSeats>0){
            availableSeats--;
            return true;
        }else{
            System.out.println("There is no available seats");
            return false;
        }
    }
}
