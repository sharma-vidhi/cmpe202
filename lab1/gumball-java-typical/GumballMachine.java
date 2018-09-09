
public class GumballMachine
{

    private int gumballsNumber;
    private int singleGumballPrice;
    private boolean acceptAll;
    private int total;

    public GumballMachine(int size, int price, boolean accept_all)
    {
        // initialization
        this.gumballsNumber = size;
        this.acceptAll = accept_all;
        this.singleGumballPrice = price;
        this.total = 0;
    }

    public void insertCoin(int coin)
    {
    		if(coin != 25 && !this.acceptAll)
    		{
    			System.out.println("Sorry! Only quarters are accepted.");
    			return;
    		}
    		this.total += coin;
    }
    
    public void turnCrank()
    {
	    	if (this.total >= this.singleGumballPrice)
	    	{
	    		if ( this.gumballsNumber > 0 )
	    		{
	    			this.gumballsNumber-- ;
	    			this.total = 0 ;
	    			System.out.println("Thanks for the payment. Gumball ejected!") ;
	    		}
	    		else
	    		{
	    			System.out.println("No more Gumballs! Sorry, can't return your payment.") ;
	    		}
	    	}
	    	else 
	    	{
	    		System.out.println("Please insert the full payment for gumball.") ;
	    	}        
    }
}
