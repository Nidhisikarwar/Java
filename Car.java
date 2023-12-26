public class Car {
    // Instance variables
    private String make;
    private String model;
    private int year;
    private int speed;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Methods
    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 5;
    }

    // Getter methods (optional)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }
}
class CarTest{
    // Main method for testing
    public static void main(String[] args) {
        // Creating instances of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2023);

        // Accessing and modifying instance variables
        System.out.println(car1.getMake());  // Output: Toyota
        System.out.println(car2.getModel());  // Output: Accord

        car1.accelerate();
        System.out.println(car1.getSpeed());  // Output: 5

        car2.brake();
        System.out.println(car2.getSpeed());  // Output: -5
    }
}

