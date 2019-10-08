import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Formatter implements InvoiceFormatter {
	
	public String formatHeader()
	   {
	      total = 0;
	  
	      String invoiceHeader = new String("<b><h1 style = 'color:blue'; align = 'center'>" + "I N V O I C E" + "</h1></b><br>");
	      return invoiceHeader;
	      
	   }

	   public String formatLineItem(LineItem item)
	   {
	      total += item.getPrice() * item.getAmount(); // Added the item amount to the getPrice Method
	     String formattedLine = new String( String.format("%s: $%.2f X %d =    $%.2f \n",
	    		  item.toString(),item.getPrice(), item.getAmount(), item.getPrice()* item.getAmount()));
	     String line = new String("<body><p style = 'color:green'; align = 'left'>" + formattedLine + "</p></body>");
	     return line;
	   }

	   public String formatFooter()
	   {
	     String footer = new String( String.format("\n\nTOTAL DUE: $%.2f\n", total));
	     String invoiceFooter = new String("<b><body style = 'color:red'; align = 'center'>"+ footer + "</body></b>");
	     return invoiceFooter;
	   }

	   private double total;
	

}
