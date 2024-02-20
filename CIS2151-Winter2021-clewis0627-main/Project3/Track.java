package Project3;

import java.util.ArrayList;
import java.util.Random;

public class Track {
    
    private int currentSpeed = 0;
    private int cartPosition = 0;
    private int turnCount = 0;

    private ArrayList<Cart> carts; 
    // private ArrayList<Integer> positions;

    private ArrayList<Bend> bends; // at random spot in track (0-1500)

    private ArrayList<Item> itemsToPickUp; // banana, mushroom, shell
    private ArrayList<Integer> itemLocation; // item location for items the user puts down
    private ArrayList<Integer> cpuItemLocation; // item location for items the cpu puts down

    Random random = new Random();

    public void dropObstacleAtLocation(Cart cart) {
        // find the position of the cart from the lists, drop obstacle
    }

    public void increaseSpeed(Cart cart) {
        // increase distance traveled by 35% (still keep as int)
    }

    public void shootShell(Cart cart) {
        // shoot mushroom at cart in front of this kart
    }

    public int getPosition() {
        
        
        return cartPosition;
    }
    
    // -3 posistion for wipeout
    // successful break = speed increase by +1

    public int getCartPosition() {
        return cartPosition;
    }

    
    public void takeTurn() {
        // starts turn

        enterBend();
        // enter bend (have 2 bends)
        // total distance == 1000m 
        // item pickup @ 300m and 700m
    }
    

    public boolean wipeout() {
        // add 3 seconds to turn
        // if motorcycle, end turn

    }

    public boolean start() {
        boolean turnGo = true;
        return turnGo;
    }
    public boolean stop() {
        boolean turnGo = false;
        return turnGo;
    }

    public int turnCounter() {
        if(turnGo == true) {
            int turnCount = turnCount + 1;
        }
        return turnCount;
    }

    while(turnGo == true) 
        System.out.println("Play " + getItem.toString() + " this turn? [y/n] ");

        placeItem();

        if(placeItem() == true) {
            itemLocation.add(getCartPosition());
            if(getItem() == "Banana") {
                Banana.use(this.Cart, getPosition());       
            }
            if(getItem() == "Mushroom") {
                Mushroom.use(this.Cart, getPosition());
            }
            if(getItem() == "Shell") {
                Shell.use(this.Cart, getPosition());
            }
        }

        
        takeTurn();
        
        for(int count = 0; count < 1000; count++) {
            // if kart pos == item drop pos...
            // ... then wipeout
        }

        stop();
    }
}
