package Project1;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Plane f35 = new Plane(50000, false, "f35", 5000);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much do you want to change the F35 altitude by? ");
        double altitudeChangeAmount = Double.parseDouble(keyboard.nextLine());

        if ((f35.getCurrentAltitudeInFeet() + altitudeChangeAmount) < 0) {
            System.out.println("This change will crash the plane!");
        }
        if (f35.getCurrentAltitudeInFeet() + altitudeChangeAmount > f35.getMaxAltitudeInFeet()) {
            System.out.println("This will exceed the maximum altitude for this plane!");
        }
        if (f35.getCurrentAltitudeInFeet() + altitudeChangeAmount < 1000 && f35.getLandingGearEnabled() == false) {
            // System.out.println("Must enable landing gear to drop below 1000 ft!");
            f35.enableLandingGear();
        }
        if (f35.getCurrentAltitudeInFeet() + altitudeChangeAmount >= 1000 && f35.getLandingGearEnabled() == true) {
            // System.out.println("Must disable landing gear to exceed 1000 ft!");
            f35.disableLandingGear();
        }

        f35.changeAltitude(altitudeChangeAmount);
    }
}