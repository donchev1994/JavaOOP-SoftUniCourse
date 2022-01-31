package Inheritance.NeedForSpeed;

public class RaceCar extends Car{

    public RaceCar(double fuel,int horsePower){
        super(fuel, horsePower);
        super.setFuelConsumption(10);
    }
}
