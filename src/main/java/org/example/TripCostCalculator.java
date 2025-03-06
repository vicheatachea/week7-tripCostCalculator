// This is a simple Java console application that asks the user for the number of kilometers to travel and the fuel price per liter.
// It then calculates the total cost of the trip, assuming a fixed fuel consumption rate.

package org.example;

import java.util.Scanner;

public class TripCostCalculator {
    public static double calculateCost(int kilometers, double fuelPrice, double fuelConsumption) {
        return ((double) kilometers / 100) * fuelConsumption * fuelPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of kilometers: ");
        int kilometers = (int) scanner.nextDouble();

        System.out.print("Enter the fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();

        System.out.print("Enter the fuel consumption per 100 km: ");
        double fuelConsumption = scanner.nextDouble();

        double tripCost = calculateCost((int) kilometers, fuelPrice, fuelConsumption);
        System.out.println("The total cost of the trip is: " + tripCost);
    }

}