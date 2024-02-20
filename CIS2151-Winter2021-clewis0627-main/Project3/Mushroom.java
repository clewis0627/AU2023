package Project3;

public class Mushroom implements Item {
    
    public void use(Cart cart, Track track) {
        track.increaseSpeed(maxSpeed);
    }
}
