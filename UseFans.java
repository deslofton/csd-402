import java.util.ArrayList;

public class UseFans {

    // Display one fan (without using toString)
    public static void displayFan(Fan fan) {

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("-----------------------");
    }

    // Display all fans in the collection
    public static void displayFans(ArrayList<Fan> fans) {

        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        // Default fan
        fans.add(new Fan());

        // Fan using constructor
        fans.add(new Fan(Fan.FAST, true, 10, "Black"));

        // Another fan
        fans.add(new Fan(Fan.MEDIUM, true, 8, "Blue"));

        // Display all fans
        displayFans(fans);
    }
}
