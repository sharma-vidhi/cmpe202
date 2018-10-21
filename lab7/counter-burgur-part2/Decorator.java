 
import java.util.Arrays;


public abstract class Decorator implements Component
{
  String[] options = new String[]{""}; 
  Component burger;
  public void setOptions(String[] options)
  {
      this.options = options;
    }
    
   private String getFormattedDescription(String[] arrayString)
   {
       String returnString="";
       for(int index=0;index<options.length;index++)
       {
           if(index==0)
           returnString+=options[index];
           else
           returnString+=" + "+options[index];
        }
           return returnString;
}

    public void printDescription() {

         burger.printDescription(); 
         System.out.println(getFormattedDescription(this.options));
    }

    public void addChild(Component c) {
	    
	}

	public void removeChild(Component c) {
        
	}

	public Component getChild(int i) {
        
        return null ;
	}
	
	protected boolean checkEntryInOptions(String option)
	{
	    return Arrays.asList(options).contains(option);
	 }
}
