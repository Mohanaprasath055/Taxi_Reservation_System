package TaxiBookingSystem;

import java.util.Scanner;

import static TaxiBookingSystem.BookTaxi.bookingTaxi;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        boolean loop = true;
        while(loop){
            System.out.println("Choose your option \n1.Book your Taxi \n2.Display Taxi details \n3.Exit \nEnter your choice:");
            Scanner s = new Scanner(System.in);
            int customer_choice = s.nextInt();
            switch (customer_choice)
            {
                case 1:
                {
                    System.out.println("Enter the pickup location:");
                    char pickupLocation = s.next().charAt(0);
                    System.out.println("Enter the drop location:");
                    char dropLocation = s.next().charAt(0);
                    System.out.println("Enter the pickup time:");
                    int pickupTime = s.nextInt();
                    System.out.println(BookTaxi.bookingTaxi(pickupLocation, dropLocation, pickupTime));
                    System.out.println("---------------------------------------");
                    break;
                }
                case 2:
                {
                    BookTaxi.display();
                    break;
                }
                case 3:
                {
                    loop = false;
                    System.out.println("Thank you!");
                    s.close();
                    break;
                }
            }
        }
    }
}