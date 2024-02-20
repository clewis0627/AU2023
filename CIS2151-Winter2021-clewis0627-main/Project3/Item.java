package Project3;

import java.util.Scanner;
import java.util.Random;

public interface Item {
    
    Scanner keyboard = new Scanner(System.in);
    
    void use(Cart cart, Track track);

    public String getItem() {
        Random rand = new Random();
        int rand1 = rand.nextInt(3); // random number 0 to 2
        // equal chance to get any of the items
        if(rand1 == 0) {
            return "Banana"
        }
        if(rand1 == 1) {
            return "Mushroom"
        }
        if(rand1 == 2) {
            return "Shell"
        }
    }

    public boolean placeItem() {
        // asks if user wants to use item
        keyboard = Scanner.nextLine();
        // if item is used do this
        if(keyboard.ignoreCase() == "y") {
            if(getItem() == "Banana") {
                // drop banana at current pos
                // add to itemLocation ArrayList
                // set getItem() to ""
                return true;
            }
            if(getItem() == "Mushroom") {
                // increase speed by 20%
                // set getItem() to ""
                return true;
            }
            if(getItem() == "Shell") {
                // cpuCart getCurrentSpeed() = 0
                // while ... speed = 0 (3 ticks?)
                // if Motorcycle, turn ends
                // set getItem() to ""
                return true;
            }
        }
        else {
            return false;
        }

    }


}
