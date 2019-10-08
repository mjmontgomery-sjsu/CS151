/**
   A product with a price and description.
*/
public class Product implements LineItem
{
   /**
      Constructs a product.
      @param description the description
      @param price the price
   */
   public Product(String description, double price)
   {
      this.description = description;
      this.price = price;
      amountOfStuff = 1;
   }
   public double getPrice() { return price; }
   public String toString() { return description; }
   public int getAmount() { return amountOfStuff; }
   public void addAmount() { amountOfStuff++; }
   private String description;
   private double price;
   private int amountOfStuff;
}
