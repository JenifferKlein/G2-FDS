public class DPremium implements IDiscount{
    @Override
    public double calcDisc(double finalPrice) {
        if(finalPrice > 200.0){
            return (finalPrice-(finalPrice*0.1));
        }else{
            return (finalPrice-(finalPrice*0.05));
        }
    }
}
