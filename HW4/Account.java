/**
 * Account Class
 * @author michaelmontgomery
 *
 */
public class Account {
	
	private int currentBalance = 75;

	public int presentBalance() {
		return currentBalance;
	}

	public void withdraw(int money) {
		currentBalance = currentBalance - money;
	}

}
