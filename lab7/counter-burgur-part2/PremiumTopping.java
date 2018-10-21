 



public class PremiumTopping extends Decorator
{
    String twoDollarsTopping = "Marinated Tomatoes";

   public PremiumTopping(Component burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    
    public double cost() {

        double costForPTopping = options.length*1.00;
        if(checkEntryInOptions(twoDollarsTopping))
        {
            costForPTopping+=2.00;
        }
        return costForPTopping + burger.cost();
    }
}
