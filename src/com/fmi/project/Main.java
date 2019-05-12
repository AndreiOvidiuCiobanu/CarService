package com.fmi.project;

import com.fmi.project.car.Car;
import com.fmi.project.services.Service;
import com.fmi.project.services.ServiceDieselDB;
import com.fmi.project.services.ServiceElectricDB;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(Service.getInstance().howManySkodaCars());
        System.out.println(Service.getInstance().howManyEcoCarsAreInService());
        System.out.println(Service.getInstance().howManyGuiltyPeopleForAccidents());
        System.out.println(Service.getInstance().theBiggestPeriodForACarInService());
        System.out.println(Service.getInstance().totalCostForServiceOperations() + "$");
        System.out.println(Service.getInstance().howManyCarsWithMoreThan200HorsePower());
        System.out.println(Service.getInstance().areAnyBmwSeria5CarInService());
        System.out.println(Service.getInstance().howManyCarsAreForTuning());
        System.out.println(Service.getInstance().theMostPowerfulCar());
        Service.getInstance().printCarsSorted();
        Service.getInstance().printCarServicesSorted();
        List<Car> cars = Service.getInstance().skodaCars();

        for(Car car : cars)
            System.out.println(car);
//        Service.getInstance().theMostExpensiveCarServiceOperation();
//        try {
//            ServiceElectricDB.getInstance().insertElectricCarDB();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            ServiceElectricDB.getInstance().updateElectricsBDById();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            ServiceElectricDB.getInstance().deleteElectricsBDByid();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}