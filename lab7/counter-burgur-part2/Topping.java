 



public class Topping extends Decorator
{


   public Topping(Component burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }

    public double cost() {

        double costForTopping = 0.0;//(options.length<=4)?0.00:(options.length-4)*0.75;

        return costForTopping + burger.cost();
    }
}
