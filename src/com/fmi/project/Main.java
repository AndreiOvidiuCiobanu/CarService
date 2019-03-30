package com.fmi.project;

import com.fmi.project.car.*;
import com.fmi.project.fuel.*;
import com.fmi.project.services.Service;

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
        Service.getInstance().theMostExpensiveCarServiceOperation();
    }
}
