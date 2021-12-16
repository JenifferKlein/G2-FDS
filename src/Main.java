import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DStandard dStandard = new DStandard();
        DPremium dPremium = new DPremium();
        FuelPump fpStandard = new FuelPump(FuelPump.FuelType.STANDARD, 5,  dStandard );
        FuelPump fpPremium = new FuelPump(FuelPump.FuelType.STANDARD, 5,  dPremium);

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos litros deseja colocar?");
        double liters = input.nextDouble();

        double lStandard = fpStandard.fillWithLiters(liters);
        double lPremium = fpPremium.fillWithLiters(liters);

        System.out.println("Total a pagar com o desconto Standard: R$"+lStandard);
        System.out.println("Total a pagar com o desconto Premium: R$"+lPremium);
    }
}
