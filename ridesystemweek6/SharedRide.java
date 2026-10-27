
package ridesystemweek6;

public class SharedRide extends EconomyRide{
    
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, 
            int durationMin, double pricePerKm, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm, pricePerMinute);
        
        if(passengerCount < 1 || passengerCount > 4){
            System.out.println("Passenger Count Can't Be Less than 1 or Higher than 4");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }
    
    @Override
    public double calculateFare(){
        return (super.calculateFare() / this.passengerCount) * (1.1);
    }
    
    @Override
    public String toString(){
            System.out.println(super.toString());
            return ("Passenger Count : " + this.passengerCount);
    }
    
    
    
}
