
package ridesystemweek6;

import java.util.ArrayList;

public class RideSystemWeek6 {

    public static void main(String[] args) {
        
        ArrayList<Ride> rideList = new ArrayList<>();
        
        Ride r = new Ride("merve", "a", "b", 10.0, 25, 15.0);
        rideList.add(r);
        
        EconomyRide er = new EconomyRide("ali", "a", "b", 8.0, 20, 12.0, 3.0);
        rideList.add(er);
        
        PremiumRide pr = new PremiumRide("ayse", "a", "b", 10.0, 25, 15.0, 10.0, 2.0);
        rideList.add(pr);
        
        SharedRide sr = new SharedRide("ahmet", "a", "b", 12.0, 25, 15.0, 3.0, 2);
        rideList.add(sr);
        
        for(Ride ride : rideList){
            System.out.println("INFORMATIONS");
            System.out.println(ride.toString());
            System.out.println(ride.calculateFare());
            System.out.println("--------------------------------");
        }
    }
    
}
