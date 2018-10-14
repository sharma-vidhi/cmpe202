package fivegyus;

import java.util.LinkedList;
import java.util.Queue;

public class PrintReciepts {
	
public static void main(String[] args) {
		
		
		Queue<MenuOptions> items=  new LinkedList<MenuOptions>();
		Queue<MenuOptions> items2=  new LinkedList<MenuOptions>();
		
		MenuOptions i1 = new MenuOptions("LBB", 5.59);
		MenuOptions i2 = new MenuOptions("LTL CAJ", 2.79);
		MenuOptions i3 = new MenuOptions("{{{{ BACON }}}}", 0.0);
		MenuOptions i4 = new MenuOptions("LETTUS", 0.0);
		MenuOptions i5 = new MenuOptions("TOMATO", 0.0);
		MenuOptions i6 = new MenuOptions("->|G ONION", 0.0);
		MenuOptions i7 = new MenuOptions("->|JALA Grilled", 0.0);
		i1.addChild(i3);
		i1.addChild(i4);
		i1.addChild(i5);
		i1.addChild(i6);
		i1.addChild(i7);
		
		items.add(i1);
		items.add(i2);
		items2.add(i1);
		items2.add(i2);
		System.out.println("====================================================\n");
		System.out.println("Customer's Receipt");
		System.out.println("====================================================\n");
		ContextStrategy contextStrategy = new ContextStrategy(new PaymentWiseDetails());
		contextStrategy.print(items);
		System.out.println("====================================================\n");
		System.out.println("Packing Slip");
		contextStrategy = new ContextStrategy(new OrderWiseDetails());
		System.out.println("====================================================\n");
		contextStrategy.print(items2);
		System.out.println("====================================================\n");
		
}

}
