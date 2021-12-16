public class OldFuelPump {
    //package com.jbittencourt;

        private double fuelPrice;
        private double quantity;
        //construtor
        public OldFuelPump(FuelPump.FuelType fuelType, double fuelPrice, double quantity) {
            this.fuelPrice = fuelPrice;
            this.quantity = quantity;
        }

        //getters e setters
        public double getFuelPrice() {
            return fuelPrice;
        }

        public void setFuelPrice(double fuelPrice) {
            this.fuelPrice = fuelPrice;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
        public double fillWithLiters(double liters) { //recebe litros
            double finalPrice;
            finalPrice = getFuelPrice() * liters; //multiplica o valor do preco do combustivel pelo litro informado pelo usuario
            //setQuantity(liters - getQuantity());
            return  finalPrice-(finalPrice*0.05); //retorna ao usuario o valor a pagar com o desconto padrao
        }
    }

