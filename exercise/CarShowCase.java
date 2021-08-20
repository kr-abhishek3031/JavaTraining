package Aug13.exercise;

public class CarShowCase {
    public static void main(String[] args) {
        Factory carCompany1 = new Factory("Ferrari");
        Car newCar = new carCompany1.builtCar();

    }
}
