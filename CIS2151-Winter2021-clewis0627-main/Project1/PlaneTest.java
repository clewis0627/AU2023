package Project1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlaneTest {
    public PlaneTest() {
    }

    @Test 
    public void testEnableLandingGear() {
        // Arrange
        boolean expectedLandingGearEnabled = true;

        // Act
        Plane plane = new Plane(50000, expectedLandingGearEnabled, "", 1);
        boolean actualLandingGearEnabled = plane.getLandingGearEnabled();

        // Assert
        assertEquals(expectedLandingGearEnabled, actualLandingGearEnabled);
    }

    @Test 
    public void testDisableLandingGear() {
        // Arrange
        boolean expectedLandingGearDisabled = false;

        // Act
        Plane plane = new Plane(50000, expectedLandingGearDisabled, "", 1);
        boolean actualLandingGearDisabled = plane.getLandingGearEnabled();

        // Assert
        assertEquals(expectedLandingGearDisabled, actualLandingGearDisabled);
    }

    @Test 
    public void testChangeAltitude1() {
        // Arrange
        double expectedChangeAltitude = plane.getCurrentAltitudeInFeet();

        // Act
        Plane plane = new Plane(50000, true, expectedChangeAltitude);
        double actualChangeAltitude = plane.getCurrentAltitudeInFeet();

        // Assert
        assertEquals(expectedChangeAltitude, actualChangeAltitude);

    }
}
