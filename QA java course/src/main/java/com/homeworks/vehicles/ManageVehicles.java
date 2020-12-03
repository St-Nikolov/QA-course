package com.homeworks.vehicles;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class ManageVehicles {


    public static void main(String[] args) throws IOException {
        Car car = null;
        Truck truck = null;
        Bus bus = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] lineTokens;
        log.info("Info for the vehicles - type initial_fuel fuel_consumption tank_capacity");
        for (int i = 0;i<3;i++) {
            lineTokens = reader.readLine().split(" ");
            switch (lineTokens[0].toLowerCase()) {
                case "car": {
                    car = new Car(Float.parseFloat(lineTokens[2]),Float.parseFloat(lineTokens[3]));
                    car.setFuelQuantity(Float.parseFloat(lineTokens[1]));
                    break;
                } case "truck" : {
                    truck = new Truck(Float.parseFloat(lineTokens[2]),Float.parseFloat(lineTokens[3]));
                    truck.setFuelQuantity(Float.parseFloat(lineTokens[1]));
                    break;

                } case "bus" : {
                    bus = new Bus(Float.parseFloat(lineTokens[2]),Float.parseFloat(lineTokens[3]));
                    bus.setFuelQuantity(Float.parseFloat(lineTokens[1]));
                    break;
                }
                default : log.error("Unknown vehicle : {} ", lineTokens[0]);
            }
        }

        log.info("How many commands do you wish to proceed");
        int numberOfCommands = Integer.parseInt(reader.readLine());

        log.info("Commands - command vehicle value");
        for (int i = 0; i<numberOfCommands; i++) {
            lineTokens = reader.readLine().split(" ");
            switch (lineTokens[0].toLowerCase()) {
                case "drive" : {
                    switch (lineTokens[1].toLowerCase()) {
                        case "car" : car.drive(Float.parseFloat(lineTokens[2]));
                        break;
                        case "truck" : truck.drive(Float.parseFloat(lineTokens[2]));
                        break;
                        case "bus" : bus.drive(Float.parseFloat(lineTokens[2]));
                        break;
                        default: log.error("Unknown vehicle to drive : {}.", lineTokens[1]);
                    }
                    break;
                } case "refuel" : {
                    switch (lineTokens[1].toLowerCase()) {
                        case "car" : car.refuel(Float.parseFloat(lineTokens[2]));
                            break;
                        case "truck" : truck.refuel(Float.parseFloat(lineTokens[2]));
                            break;
                        case "bus" : bus.refuel(Float.parseFloat(lineTokens[2]));
                            break;
                        default: log.error("Unknown vehicle to drive : {}.", lineTokens[1]);
                    }
                    break;
                } case "driveempty" : {
                    if (lineTokens[1].equalsIgnoreCase("bus")) bus.driveEmpty(Float.parseFloat(lineTokens[2]));
                    else log.error("Only bus has a choice to travel full or empty");
                }

            }

        }

        log.info("The car has {} liters left in the tank.", car.getFuelQuantity());
        log.info("The truck has {} liters left in the tank.", truck.getFuelQuantity());
        log.info("The bus has {} liters left in the tank.", bus.getFuelQuantity());

    }
}
