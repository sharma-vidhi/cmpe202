 



public class Sauce extends Decorator
{


   public Sauce(Component burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    public double cost() {

        double costForSauce = (options.length<=1)?0.00:(options.length-1)*0.50;
        return costForSauce + burger.cost();
    }
}
