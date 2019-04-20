package com.fmi.project.services;

import com.fmi.project.autoService.*;
import com.fmi.project.car.*;
import com.fmi.project.fuel.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Service {

    private static final Service instance = new Service();
    private static List<Car> carsList = new ArrayList<Car>();
    private static Vector<CarService> servicesVector = new Vector<CarService>();
    private static Car[] cars = new Car[10];
    private static Fuel[] fuels = new Fuel[10];
    private static CarService[] listOfServices = new CarService[10];

    private Service() {

        fuels[0] = new Diesel(true, true, 1);

        fuels[1] = new Gasoline(false, true, "Turbo");

        fuels[2] = new Diesel(true, true, 1);

        fuels[3] = new Diesel(true, true, 3);

        fuels[4] = new Hybrid(false, false, 50);

        fuels[5] = new Diesel(true, true, 1);

        fuels[6] = new Diesel(true, true, 1);

        fuels[7] = new Diesel(true, true, 1);

        fuels[8] = new Gasoline(true, true, "Turbo");

        fuels[9] = new Electric(false, false, 500,
                120);

        fuels[0] = FileTextServiceDiesel.getInstance().readDieselFromFile("files/diesel.csv");

        System.out.println("fuel[0] " + fuels[0].toString());

        cars[0] = new Break("Skoda", "Superb", 6, "blue",
                190, 2000, 123000,
                8.8, 350, fuels[0], 700);

        cars[1] = new Break("Skoda", "Octavia", 5, "green",
                150, 1600, 50000,
                5.5, 200, fuels[1], 450);

        cars[2] = new Sedan("Mercedes-Benz", "C-Class", 6, "black", 170,
                2200, 35000, 6.0, 350, fuels[2],
                400, false);

        cars[3] = new Break("Bmw", "Seria 5", 5, "black",
                381, 3000, 100000,
                12, 500, fuels[3], 600);

        cars[4] = new Suv("Volvo", "XC 90", 6, "black",
                280, 2000, 125000,
                10, 450, fuels[4], false);

        cars[5] = new Suv("Nissan", "X-Trail", 6, "orange",
                170, 1600, 25000,
                9, 450, fuels[5], true);

        cars[6] = new Suv("Skoda", "Kodiaq", 6, "green",
                170, 2000, 45000,
                9, 450, fuels[6], true);

        cars[7] = new Small("Volkswagen", "Polo", 6, "yellow",
                95, 1000, 6000,
                12, 300, fuels[7]);

        cars[8] = new Coupe("Bmw", "Z4", 6, "blue",
                340, 3000, 15000,
                14, 450, 3, true,
                true, fuels[8]);

        cars[9] = new Sedan("Tesla", "Model 3", 0, "red", 400,
                0, 35000, 0, 0, fuels[9],
                400, false);

        listOfServices[0] = new CarServiceCasco(cars[0], 500, 30, true,
                false, 0);

        listOfServices[1] = new CarServiceInsurance(cars[1], 1000, 10, true,
                false);

        listOfServices[2] = new CarServiceRevision(cars[2], 300, 7, false);

        listOfServices[3] = new CarServiceTuning(cars[3], 5000, 40,
                "oglinda, suspensii, jante");

        listOfServices[4] = new CarServiceRevision(cars[4], 800, 2, true);

        listOfServices[5] = new CarServiceCasco(cars[5], 5000, 14, true,
                false, 0);

        listOfServices[6] = new CarServiceInsurance(cars[6], 800, 14, true,
                true);

        listOfServices[7] = new CarServiceTuning(cars[7], 8000, 30,
                "faruri, suspensii, jante, boxe, vopsea");

        listOfServices[8] = new CarServiceTuning(cars[8], 3000, 10, "vopsea");

        listOfServices[9] = new CarServiceTuning(cars[9], 10000, 20, "upgrade estetic");

        for (int i = 0; i < 10; i++) {
            carsList.add(cars[i]);
            servicesVector.add(listOfServices[i]);
        }
        Collections.sort(carsList);
        Collections.sort(servicesVector);
    }

    public static Service getInstance() {
        return instance;
    }

    public int howManySkodaCars() {
        int number = 0;
        for (int i = 0; i < cars.length; i++)
            if (cars[i].getBrand() == "Skoda")
                number++;
        return number;
    }

    public int theBiggestPeriodForACarInService() {
        int period = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (period < listOfServices[i].getDuration())
                period = listOfServices[i].getDuration();
        return period;
    }

    public int howManyGuiltyPeopleForAccidents() {
        int number = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getClass() == CarServiceCasco.class)
                number++;
        return number;
    }

    public double totalCostForServiceOperations() {
        float sum = 0;
        for (int i = 0; i < listOfServices.length; i++)
            sum += listOfServices[i].getCost();
        return sum;
    }

    public void theMostExpensiveCarServiceOperation() {
        float cost = 0;
        int index = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getCost() > cost) {
                cost = listOfServices[i].getCost();
                index = i;
            }
        System.out.println("Cost:" + cost + "$ for:" + listOfServices[index].getCar().getBrand()
                + " " + listOfServices[index].getCar().getModel());
    }

    public int howManyEcoCarsAreInService() {
        int number = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (!listOfServices[i].getCar().getFuel().isMayBeForbidden())
                number++;
        return number;
    }

    public int howManyCarsWithMoreThan200HorsePower() {
        int number = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getCar().getHorsePower() > 200)
                number++;
        return number;
    }

    public boolean areAnyBmwSeria5CarInService() {
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getCar().getBrand() == "Bmw" &&
                    listOfServices[i].getCar().getModel() == "Seria 5")
                return true;
        return false;
    }

    public int howManyCarsAreForTuning() {
        int number = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getClass() == CarServiceTuning.class)
                number++;
        return number;
    }

    public String theMostPowerfulCar() {
        int power = 0;
        int index = 0;
        for (int i = 0; i < listOfServices.length; i++)
            if (listOfServices[i].getCar().getHorsePower() > power) {
                power = listOfServices[i].getCar().getHorsePower();
                index = i;
            }
        return listOfServices[index].getCar().getBrand() + " " + listOfServices[index].getCar().getModel();
    }

    public void printCarsSorted() {
        for (Car car : carsList) {
            System.out.println(car.getBrand());
        }
    }

    public void printCarServicesSorted() {
        for (CarService carService : servicesVector)
            System.out.println(carService.getDuration());
    }
}
