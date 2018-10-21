 
import java.util.ArrayList;
import java.util.Arrays;


public class Bun extends Decorator
{
    private ArrayList<String> oneDollarBuns =new ArrayList<String>(Arrays.asList("Gluten-Free Bun","Hawaiian Bun"));
    private String halfDollarBun = "Pretzel Bun";
    private String requestedBun="";
  public Bun(Component burger,String[] bun) {
       super.burger = burger;
       this.requestedBun = bun[0];
       setOptions(bun);
    }


    public double cost() {
        double costForBun = 0.0;
        if(requestedBun.equals(halfDollarBun))
         costForBun = 0.50;
         else if(oneDollarBuns.contains(requestedBun))
         costForBun = 1.00;
         
        return costForBun + burger.cost();
    }
}
