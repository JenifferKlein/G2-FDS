public class DStandard implements IDiscount{
    @Override
    public double calcDisc(double finalPrice) {
        double dPrice = finalPrice-(finalPrice*0.05);
        return dPrice;
    }
}
