/**
 * Bank Account Class
 * @author michaelmontgomery
 *
 */
public class BankAccount implements Runnable {
	
	private Account account = new Account();
	
	/**
	 * Returns Balance
	 * @return balance
	 */
	public int getBalance()
	{
		return balance;
	}
	
	private int balance;

	 @Override
	    public void run()
	 {
	        for (int x = 0; x < 5; x++)
	        {
	            completeWithdrawal(20);
	            if (account.presentBalance() < 0) 
	            {
	                System.out.println("The account has been overdrawn!");
	            }
	        }
	        
	 }
	
	 private void completeWithdrawal(int amount)
	 {
	        if (account.presentBalance() >= amount) 
	        {
	            System.out.println(Thread.currentThread().getName() + " is going to withdraw money");
	            try 
	            {
	                Thread.sleep(100);
	            } 
	            
	            catch (InterruptedException ex) 
	            {
	            	
	            }
	            
	            account.withdraw(amount);
	            
	            System.out.println(Thread.currentThread().getName() + " has completed the withdrawal from the account");
	        } 
	        
	        else
	        	
	        {
	            System.out.println("There is not enough in the account for " + Thread.currentThread().getName() + " to withdraw " + account.presentBalance());
	        }
	    }


}
