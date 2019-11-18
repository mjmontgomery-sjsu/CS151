/**
 * SychronizedBankAccount
 * @author michaelmontgomery
 *
 */
public class SynchronizedBankAccount implements Runnable {

	private Account account = new Account();
	
	/**
	 * Complete Withdrawl
	 * @param amount
	 */
	 private  synchronized void completeWithdrawal(int amount)
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
	
}
