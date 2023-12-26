 class Car1 {
    // Instance variables
    private String make;
    private String model;
    private int year;
    private int speed;

    // Constructor
     Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Methods
     void accelerate() {
        this.speed += 5;
    }

     void brake() {
        this.speed -= 5;
    }

    // Getter methods (optional)
    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    int getSpeed() {
        return speed;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating instances of the Car class
        Car1 car1 = new Car1("Toyota", "Camry", 2022);
        Car1 car2 = new Car1("Honda", "Accord", 2023);

        // Accessing and modifying instance variables
        System.out.println(car1.getMake());  // Output: Toyota
        System.out.println(car2.getModel());  // Output: Accord

        car1.accelerate();
        System.out.println(car1.getSpeed());  // Output: 5

        car2.brake();
        System.out.println(car2.getSpeed());  // Output: -5
    }
}


