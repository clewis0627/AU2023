package Project1;

public class Plane {
    private final double maxAltitudeInFeet;
    private boolean landingGearEnabled;
    private final String model;
    private double currentAltitudeInFeet;
    
    public double finalAltitudeInFeet;
    public double altitudeChangeAmount = 0;

    public Plane(double maxAlititudeInFeet, boolean landingGearEnabled, String model, double currentAltitudeInFeet) {
        this.maxAltitudeInFeet = maxAlititudeInFeet;
        this.landingGearEnabled = landingGearEnabled;
        this.model = model;
        this.currentAltitudeInFeet = currentAltitudeInFeet;
    }

    public double getMaxAltitudeInFeet() {
        return maxAltitudeInFeet;
    }

    public boolean getLandingGearEnabled() {
        return landingGearEnabled;
    }

    public String getModel() {
        return model;
    }

    public double getCurrentAltitudeInFeet() {
        return currentAltitudeInFeet;
    }

    public boolean enableLandingGear() {
        if (currentAltitudeInFeet > 1000) {
            landingGearEnabled = false;
            return landingGearEnabled;
        } 
        else {
            landingGearEnabled = true;
            return landingGearEnabled;
        }
    }

    public boolean disableLandingGear() {
        if (currentAltitudeInFeet < 1000) {
            landingGearEnabled = true;
            return landingGearEnabled;
        }
        else {
            landingGearEnabled = false;
            return landingGearEnabled;
        }
    }

    public double changeAltitude(double altitudeChangeAmount) {
        finalAltitudeInFeet = currentAltitudeInFeet + altitudeChangeAmount;

        if (finalAltitudeInFeet > maxAltitudeInFeet) {
            currentAltitudeInFeet = maxAltitudeInFeet;
            return currentAltitudeInFeet;
        }
        if (finalAltitudeInFeet < 1000 && landingGearEnabled == false) {
            enableLandingGear();
            currentAltitudeInFeet = finalAltitudeInFeet;
            return currentAltitudeInFeet;
        }
        if (finalAltitudeInFeet >= 1000 && landingGearEnabled == true) {
            disableLandingGear();
            currentAltitudeInFeet = finalAltitudeInFeet;
            return currentAltitudeInFeet;
        }
        else {
            currentAltitudeInFeet = finalAltitudeInFeet;
            return currentAltitudeInFeet;
        }
    }
}

