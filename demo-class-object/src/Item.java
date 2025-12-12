// ! Item Class 
public class Item {
    private double price; 
    private double quantity; 

public Item(double price, double quantity) {
   this.price = price; 
   this.quantity = quantity; 
}

public double getPrice() {
   return this.price; 
}

public double getQuantity() {
   return this.quantity; 
}

public double amount() {
   return BigDecimal.valueOf(this.price) // 
      .multiply(BigDecimal.valueOf(this.quantity)) // 
      . doubleValue(); 
}

 public static void main(String[] args) {
    // 99.9 X 2
    // 10.5 X 6 
    Item rice = new Item(99.9, 2); 
    Item iceCream = new Item(10.5,6); 
    // order 1.amount()
    new Order(1)
    o1.add(rice); 
    o1.add(iceCream); 
    System.out.println(01.amount());
   
    
    // c1.getOrderAmount(1) // Customer c1 to get Order Amount by an order id
   Customer c1 = new Customer(); 
   c1.add(o1);  
 }   
}
