
package ridesystemweek6;

public class PremiumRide extends Ride{
    
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, 
            int durationMin, double pricePerKm, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;
        
        if(surgeMultiplier < 1.0 || surgeMultiplier > 3.0){
            System.out.println("Surge Multiplier Can't Be Less than 1.0 or Higher than 3.0");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }
    
    @Override
    public double calculateFare(){
        return (super.calculateFare() + this.comfortFee) * (this.surgeMultiplier);
    }
    
    @Override
    public String toString(){
        System.out.println(super.toString());
        return ("Comfort Fee : " + this.comfortFee + ", Surge Multiplier : " + this.surgeMultiplier);
        
    }
    
    
    
}
