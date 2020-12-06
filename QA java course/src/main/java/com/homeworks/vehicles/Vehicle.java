package com.homeworks.vehicles;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public abstract class Vehicle {
    private float fuelQuantity = 0;
    // Liters per 100km
    private final float fuelConsumption;
    private final float tankCapacity;


    public Vehicle(float fuelConsumption, float tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelQuantity(float fuelQuantity) {
        if (fuelQuantity<0) {
            log.error("Fuel must be a positive number");
            return;
        }
        this.fuelQuantity = fuelQuantity;
    }

    protected boolean drive(float distance,float fuelConsumption){
        if (distance<0) {
            log.error("Distance must be a positive number");
            return false;
        }
        float fuelConsumed = (distance*fuelConsumption)/100;
        if (fuelConsumed <= fuelQuantity) {
            fuelQuantity -= fuelConsumed;
            log.info("Distance gain {}, fuel spent {}", distance, fuelConsumed);
            return true;
        }
        log.error("Not enough fuel for {} kms.", distance);
        return false;
    }

    protected boolean refuel(float newQuantity){
        if (fuelQuantity<0) {
            log.error("Fuel must be a positive number");
            return false;
        }

        float fuelQuantity = this.fuelQuantity + newQuantity;

        if (fuelQuantity <= tankCapacity) {
            this.fuelQuantity = fuelQuantity;
            log.info("Refueled {}l. Fuel in the tank {}l..", newQuantity,fuelQuantity );
            return true;
        }
        log.error("Not enough space in the tank.");
        return false;
    }
}
