
package ridesystemweek6;

public class EconomyRide extends Ride {
    
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, 
            double distanceKm, int durationMin, double pricePerKm, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }
    
    @Override
    public double calculateFare(){
        super.calculateFare();
        
        if((this.pricePerMinute * getDurationMin()) < 50){
            return 50.0;
        } else {
            return this.pricePerMinute * getDurationMin();
        }
    }
    
    @Override
    public String toString(){
        System.out.println(super.toString());
        return ("Price Per Minute : " + this.pricePerMinute);
    }
    
    
    
}
