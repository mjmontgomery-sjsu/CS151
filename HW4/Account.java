
public class Account {
	
	private int currentBalance = 50;

	public int showBalance() {
		return currentBalance;
	}

	public void drawn(int money) {
		currentBalance = currentBalance - money;
	}

}
