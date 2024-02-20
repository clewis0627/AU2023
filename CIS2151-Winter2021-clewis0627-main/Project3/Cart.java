package Project3;

public abstract class Cart {

    public int currentSpeed = 0;
    public int cartPosition = 0;

    protected Cart(int maxSpeed, int acceleration, int breakSpeed) {
        // this.maxSpeed = maxSpeed;
        // this.acceleration = acceleration;
        // this.breakSpeed = breakSpeed;
    }

    public void enterBend(Bend bend) {
        if(currentSpeed > getBendSpeed()) {
            wipeout();
        }
        if(currentSpeed <= getBendSpeed()) {
            while(this.turnCounter == turnCounter) {
                int maxSpeed = maxSpeed + 1;
            }
        }
    }

    public Item cartItem(Item item, Item item2) {
        getItem();
        return item;
    }

    public int accelerate() {
        for(int v1 = getCurrentSpeed(); v1 <= getMaxSpeed(); v1 += getAcceleration()) {
            int currentSpeed = v1;
        }
        return currentSpeed;
    }

    public int slow() {
        for(int v2 = getCurrentSpeed(); v2 >= 0; v -= getBreakSpeed()) {
            int currentSpeed = v2;
            if(int currentSpeed == getBendSpeed()) {
                break;
            }
        }
        return currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getAcceleration() {
        return acceleration;
    }
    public int getBreakSpeed() {
        return breakSpeed;
    }
}
