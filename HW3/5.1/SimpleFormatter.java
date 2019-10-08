/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice() * item.getAmount(); // Added the item amount to the getPrice Method
      return (String.format("%s: $%.2f X %d =    $%.2f \n",
    		  item.toString(),item.getPrice(), item.getAmount(), item.getPrice()* item.getAmount()));
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}
