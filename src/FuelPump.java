//package com.jbittencourt;

public class FuelPump {

    //Declarando as variaveis
    public enum FuelType {
        STANDARD, PREMIUM, DIESEL, ALCOHOL
    }

    private double fuelPrice;
    private double fuelQuantity = 500;
    private IDiscount discount;

    //construtor
    public FuelPump(FuelType fuelType, double fuelPrice, IDiscount discount) {
        this.fuelPrice = fuelPrice;
        this.discount = discount;
    }

    //getters e setters
    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double fillWithLiters(double liters) {
        double finalPrice = 0;
        if (liters > getFuelQuantity()) {
           System.out.println("combustivel insuficiente para reabastecer a quantidade desejada");
        } else {
            finalPrice = getFuelPrice() * liters;
            setQuantity(liters - getFuelQuantity());
            if (discount != null) {
                return discount.calcDisc(finalPrice);
            }
        }
        return finalPrice;
    }
}