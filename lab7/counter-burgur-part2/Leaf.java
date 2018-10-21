 

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    private Double price ;
    private Component burger;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf(String message,Component burger)
    {
        description = message;
        price = burger.cost();
        this.burger = burger;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
        if(burger!=null)burger.printDescription();
    }

    public void addChild(Component c) {
	    
	}

	public void removeChild(Component c) {
        
	}

	public Component getChild(int i) {
        
        return null ;
	}
	
	public double cost()
	{
	    return price;
	   }
}
 
