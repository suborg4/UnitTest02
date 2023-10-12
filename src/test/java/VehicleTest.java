import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("BMW", "X5", 2022);
        motorcycle = new Motorcycle("Honda", "CBF 1000", 2019);
    }

    @Test
    @DisplayName("Car should be an instance of Vehicle")
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Car should have four wheels")
    public void testCarHasFourWheels() {
        assertEquals(4, car.getNumWheels(), "Number of wheels does not match the car object");
    }

    @Test
    @DisplayName("Motorcycle should have two wheels")
    public void testMotorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels(), "Number of wheels does not match the motorcycle object");
    }

    @Test
    @DisplayName("Car should reach a speed of 60 in test drive mode")
    public void testCarSpeedInTestDriveMode() {
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Car speed in test drive mode does not match the expected value");
    }

    @Test
    @DisplayName("Motorcycle should reach a speed of 75 in test drive mode")
    public void testMotorcycleSpeedInTestDriveMode() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle speed in test drive mode does not match the expected value");
    }

    @Test
    @DisplayName("Car should stop when parked")
    public void testCarSpeedWhenParked() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car speed when parked does not match the expected value");
    }

    @Test
    @DisplayName("Motorcycle should stop when parked")
    public void testMotorcycleSpeedWhenParked() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle speed when parked does not match the expected value");
    }
}