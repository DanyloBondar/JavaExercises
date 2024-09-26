import java.util.Scanner;
public class TravelTime {
    public static void main(String[] args) {
        int travelDistance;
        int speed = 0;
        String userInputTransport;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How far do you want to go (in km)?");
        travelDistance = scanner.nextInt();
        if (travelDistance <= 0) {
            System.out.println("Distance cannot be negative");
        }
        System.out.println("What is the type of transport? (walk / bicycle / car / train)");
        userInputTransport = scanner.next();

        scanner.close();

        if (userInputTransport.equals("walk")) {
            speed = 5;
        }
        else if (userInputTransport.equals("bicycle")) {
            speed = 15;
        }
        else if (userInputTransport.equals("car")) {
            speed = 50;
        }
        else if (userInputTransport.equals("train")) {
            speed = 70;
        }
        else {
            System.out.println("Incorrect type of transport");
        }

        double totalHours = (double) travelDistance / speed;
        int hours = (int) totalHours;
        int minutes = (int) Math.round((totalHours - hours) * 60); // 1.71 - 1 = 0.71 * 60 = 42.6 and after math.round it equals 43

        if (minutes == 0) {
            System.out.println("Your distance time is " + hours + " hours");
        } else {
            System.out.println("Your distance time is " + hours +" hours " + minutes + " minutes");
        }
   }
}
