package Project3;

public class Heavy extends Cart {
    public Item item2;
    public Item item;

    public Heavy(int maxSpeed, int acceleration, int breakSpeed, Item item2) {
        super(maxSpeed + 2, acceleration - 2, breakSpeed - 2);
        this.item2 = item2;

    }

    public void cartItem(Item item, Item item2) {
        this.item = new getItem();
        this.item2 = new getItem();
    }

    // returns item
    public Item getItem() {
        return item;
    }
    // returns item2 (only for Heavy)
    public Item getItem2() {
        return item2;
    }

}
