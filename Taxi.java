package TaxiBookingSystem;

public class Taxi implements Cloneable{
    private char currentPosition = 'A';
    private char pickupLocation;
    private char dropLocation;
    private int pickupTime;
    private int dropTime;
    private int taxiID;
    private int customerID;
    private int earnings;

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public int getDropTime(){
        return dropTime;
    }
    public void setDropTime(int dropTime){
        this.dropTime = dropTime;
    }
    public int getTaxiID(){
        return taxiID;
    }
    public void setTaxiID(int taxiID){
        this.taxiID = taxiID;
    }

    public char getCurrentPosition(){
        return currentPosition;
    }
    public void setCurrentPosition(char currentPosition){
        this.currentPosition = currentPosition;
    }
    public int getPickupTime(){
        return pickupTime;
    }
    public void setPickupTime(int pickupTime){
        this.pickupTime = pickupTime;
    }
    public char getPickupLocation(){
        return pickupLocation;
    }
    public void setPickupLocation(char pickupLocation){
        this.pickupLocation = pickupLocation;
    }
    public char getDropLocation(){
        return dropLocation;
    }
    public void setDropLocation(char dropLocation){
        this.dropLocation = dropLocation;
    }
    public int getCustomerID(){
        return customerID;
    }
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public int getEarnings(){
        return earnings;
    }
    public void setEarnings(int earnings){
        this.earnings = earnings;
    }

    public String Histroy(){
        return "Taxi: " + getTaxiID() + "\nCurrent Location: " + getCurrentPosition() + "\nEarnings:" + getEarnings();
    }

}
