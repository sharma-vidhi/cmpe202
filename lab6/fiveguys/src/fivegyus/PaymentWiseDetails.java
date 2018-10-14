package fivegyus;

import java.util.Queue;

public class PaymentWiseDetails implements RecieptStrategy {

	@Override
	public void printReceipt(Queue<MenuOptions> options) {
		MenuOptions poppeditem;
		Double total = 0.0;
		for (int i = 0; i <= options.size(); i++) {
			poppeditem = options.poll();
			total += poppeditem.getPrice();
			System.out.println(poppeditem.getDescription() + "" + poppeditem.getPrice());
			for (MenuOptions items2 : poppeditem.getChild())
				System.out.println(items2.getDescription());
		}
		System.out.println("Total :" + total);
	}

}
