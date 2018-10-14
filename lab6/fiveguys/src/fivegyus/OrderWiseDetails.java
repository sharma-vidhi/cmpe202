package fivegyus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

public class OrderWiseDetails implements RecieptStrategy {

	@Override
	public void printReceipt(Queue<MenuOptions> options) {
		MenuOptions poppeditem;
		List<MenuOptions>list;
		for(int i =0; i<=options.size();i++)
		{
			list = new ArrayList<MenuOptions>();
			poppeditem = options.poll();
			System.out.println(poppeditem.getDescription());		
			for(MenuOptions items2 : poppeditem.getChild()) 
			{
				if((items2.getDescription().contains("-")  ||
						(items2.getDescription().contains("{") ) )) 
					list.add(items2); 
				else
					System.out.println( items2.getDescription());
					
			}
			if(list.size()>0)
			{
				Collections.sort(list, Comparator.comparing(MenuOptions::getDescription));
			      for(int k = 0; k < list.size(); k++)
			    	  System.out.println( list.get(k).toString() + "\n");
			}
		
		}		
}
		
	
}
