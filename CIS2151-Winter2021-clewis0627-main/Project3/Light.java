package Project3;

public class Light extends Cart {

    public Light(int maxSpeed, int acceleration, int breakSpeed) {
        super(maxSpeed - 2, acceleration + 2, breakSpeed + 2);
        

    }

    public Item cartItem(Item item, "") {
        this.item = getItem();
        return this.item;
        
    }

    
}