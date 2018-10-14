package fivegyus;

import java.util.List;
import java.util.Queue;

public class ContextStrategy {
	
	private RecieptStrategy receiptStrategy;

	public ContextStrategy(RecieptStrategy receiptStrategy) {
		this.receiptStrategy = receiptStrategy;
	}
	public void print(Queue<MenuOptions> options)
	{
		receiptStrategy.printReceipt(options);
}

}
