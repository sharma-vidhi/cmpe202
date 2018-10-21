 

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private Double price =0.00;
    
    public Composite ( String d )
    {
        description = d ;
    }

	public void printDescription() {
        System.out.println( description );
        for (Component obj  : components)
        {
            this.price+=obj.cost();
            obj.printDescription();           
            System.out.println( "---------------------------------------------------------------------" );
            System.out.println( "---------------------------------------------------------------------" );
            
        }
        System.out.println("Subtotal : "+cost() );
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	 
	public double cost()
	{
	    return price;
	   }
}
 
