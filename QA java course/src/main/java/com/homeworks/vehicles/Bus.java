package com.homeworks.vehicles;

public class Bus extends Vehicle {
    private final float AIR_CONDITIONER_CONSUMPTION = (float) 1.4;

    public Bus(float fuelConsumption, float tankCapacity) {
        super(fuelConsumption, tankCapacity);
    }

    public boolean drive(float distance,boolean useAirConditioner){
        return super.drive(distance,useAirConditioner ? getFuelConsumption() : getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
    }

    public boolean drive(float distance){
        return super.drive(distance,getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
    }

    public boolean driveEmpty(float distance){
        return super.drive(distance,getFuelConsumption());
    }

    @Override
    public boolean refuel(float newQuantity) {
        return super.refuel(newQuantity);
    }
}
