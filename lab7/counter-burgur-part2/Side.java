 


public class Side extends Decorator
{
    public Side(Component burger,String[] options) {
       super.burger = burger;
       setOptions(options);
    }


    public double cost() {
         double costForSide = 0.0;
        if(!checkEntryInOptions("No Side"))
        costForSide = (options.length<=0)?0.00:(options.length)*3.00;

        return costForSide + burger.cost();
    }
}
