package TaxiBookingSystem;
import java.util.ArrayList;
public class BookTaxi {
    private static ArrayList<Taxi> taxiList= new ArrayList<Taxi>();
    private static ArrayList<Taxi> bookingDetails = new ArrayList<Taxi>();
    private static int taxiLimit = 4, CustomerID = 1;
    public static String bookingTaxi(char pickupLocation,char dropLocation,int pickupTime) throws CloneNotSupportedException{
        if(taxiList.size()<=taxiLimit){
            taxiList.add(new Taxi());
        }

        int min = Integer.MAX_VALUE;
        Taxi Allocated_taxi = null;

        for(Taxi t: taxiList){
            if((t.getDropTime() <= pickupTime) && (Math.abs(pickupLocation - t.getCurrentPosition()))<=min) {
                if(Math.abs(pickupLocation - t.getCurrentPosition()) == min){
                    if (Allocated_taxi != null && t.getEarnings() < Allocated_taxi.getEarnings()){
                        Allocated_taxi = t;
                    }
                }
                else{
                    Allocated_taxi = t;
                    min = Math.abs(pickupLocation - t.getCurrentPosition());
                }
            }

        }
        if(Allocated_taxi != null){
            Allocated_taxi.setCustomerID(CustomerID++);
            Allocated_taxi.setPickupLocation(pickupLocation);
            Allocated_taxi.setPickupTime(pickupTime);
            Allocated_taxi.setDropLocation(dropLocation);
            Allocated_taxi.setCurrentPosition(dropLocation);
            Allocated_taxi.setDropTime(pickupTime + Math.abs(dropLocation - pickupLocation));
            Allocated_taxi.setEarnings((Allocated_taxi.getEarnings()) + ((Math.abs(dropLocation - pickupLocation)*15-5)*10)+100);
            Allocated_taxi.setTaxiID(taxiList.indexOf(Allocated_taxi)+1);
            bookingDetails.add((Taxi)Allocated_taxi.clone());
            return "Your Taxi has been successfully allocated. \nYour Taxi number is " + Allocated_taxi.getTaxiID();
        }

        return "Taxi is not available. Thank You!";

    }
    public static void display(){
        System.out.println("------------ TAXI BOOKED HISTORY -------------");
        for( Taxi t : bookingDetails){
            System.out.println(t.Histroy());
        }
        System.out.println("----------------------------------------------");
    }

}
