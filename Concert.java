//Pranav Kanumuri
public class Concert {

    // Private instance variables
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default constructor: sets everything to default values
    public Concert() {
        this.bandName = "No name yet";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Constructor with parameters for band name, capacity, price by phone, price at venue
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Constructor with parameters for all attributes
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors (getters)
    public String getBandName() {
        return bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    // Mutators (setters) with validation
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        }
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        }
    }

    // Method to calculate total tickets sold
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    // Method to calculate tickets remaining
    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    // Method to add tickets sold at venue
    public void buyTicketsAtVenue(int tickets) {
        if (ticketsRemaining() >= tickets) {
            numTicketsSoldAtVenue += tickets;
        } else {
            System.out.println("The concert is sold out!");
        }
    }

    // Method to add tickets sold by phone
    public void buyTicketsByPhone(int tickets) {
        if (ticketsRemaining() >= tickets) {
            numTicketsSoldByPhone += tickets;
        } else {
            System.out.println("The concert is sold out!");
        }
    }

    // Method to calculate total sales
    public double totalSales() {
        return (numTicketsSoldByPhone * priceByPhone) + (numTicketsSoldAtVenue * priceAtVenue);
    }
}