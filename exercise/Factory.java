package Aug13.exercise;

public class Factory implements BuildCar{
    public final String companyName;
    public Factory (String cName){
        this.companyName = cName;
    }
    Car car1 = new Car();
    public Car builtCar(){
           return new Car();
    }

}
