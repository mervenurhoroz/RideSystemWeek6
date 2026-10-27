
package ridesystemweek6;

public class Ride {
    
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, 
            double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        
        if(distanceKm > 0){
            this.distanceKm = distanceKm;
        } else {
            System.out.println("Distance Can't Be Less or Equal to 0!");
        }
        
        if(durationMin > 0){
            this.durationMin = durationMin;
        } else {
            System.out.println("Duration Minute Can't Be Less or Equal to 0!");
        }
        
        if(pricePerKm > 0){
            this.pricePerKm = pricePerKm;
        } else {
            System.out.println("Price Per Km Can't Be Less or Equal to 0!");
        } 
    }
    
    public double calculateFare(){
        return (getDistanceKm() * getPricePerKm());
    }
    
    @Override
    public String toString(){
        return ("Passenger name : " + getPassengerName() + ", Pickup : " + getPickup() + ", Destination : " 
                + getDestination() + ", Distance : " + getDistanceKm() + ", Duration : " + getDurationMin() 
                + ", Price Per Km : " + getPricePerKm());
    }
    
    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
}
