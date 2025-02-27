/**
   A line item in an invoice.
*/
public interface LineItem
{
   /**
      Gets the price of this line item.
      @return the price
   */
   double getPrice();
   /**
      Gets the description of this line item.
      @return the description
   */   
   String toString();
   
   /**
	 * Gets the amount of the same item purchased
	 * Implemented in other classes
	 * 
	 * @return the amount
	 */
	int getAmount();
	
	/**
	 * Increases the amount of the item being purchased
	 * Implemented in other classes
	 */
	void addAmount(); 

}
