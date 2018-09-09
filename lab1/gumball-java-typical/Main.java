

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 25, false);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		
		gumballMachine = new GumballMachine(5, 50, false);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		gumballMachine = new GumballMachine(5, 50, true);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();

	}
}
