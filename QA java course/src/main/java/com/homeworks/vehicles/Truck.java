package com.homeworks.vehicles;

public class Truck extends Vehicle {
    private final float AIR_CONDITIONER_CONSUMPTION = (float) 1.6;
    private final float REFUEL_EFFICIENCY = (float)0.95;

    public Truck(float fuelConsumption, float tankCapacity) {
        super(fuelConsumption, tankCapacity);
    }

    public boolean drive(float distance,boolean useAirConditioner){
        return super.drive(distance,useAirConditioner ? getFuelConsumption() : getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
    }

    public boolean drive(float distance){
        return super.drive(distance,getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
    }


    @Override
    public boolean refuel(float newQuantity) {
        return super.refuel(newQuantity*REFUEL_EFFICIENCY);
    }
}
