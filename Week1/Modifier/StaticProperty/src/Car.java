public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car (String name, String engine) {
        this.engine = engine;
        this.name = name;
        numberOfCar++;
    }

}
