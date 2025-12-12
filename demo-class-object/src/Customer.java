// ! One to Many 

import java.math.BigDecimal;

public class Customer {
    private Order[] orders; // !  Object Reference

    public Customer() {
        this.orders = new Order[0]; // ! 裝唔到嘢嘅 Array
    }

    public void add(Order newOrder) {
        // ! Step 1: create a new array with length + 1 // 開長一格嘅 Array
        Order[] newOrders = new Order[this.orders.length + 1]; 
        // ! Step 2: copy original array elements to new array 
        for (int i = 0; i < this.orders.length; i++) {
            newOrders[i] = this.orders[i]; 
        }
        //! Step 3: Put the new element at tail of new array
        newOrders[newOrders.length - 1] = newOrder; 
        // ! Step 4: Assign the new array objects to object reference 
        this.orders = newOrders;  
    }

    // Presentation
    // total order amount += 100_000
    public boolean isVIP() {
        BigDecimal total = BigDecimal.ZERO; 
        for (Order order : this.order) {
            total = total.add(BigDecimal.valueOf(order.amount())); 
        }
        return total.doubleValue() >= 100_000; 
    }

    public double getOrderAmount(int orderId) {
        for (Order o : this.orders) {
            if (o.getId() == orderId)
                return o.amount(); 
        }
        return 0.0; 
    }

    // getOrder(int orderId)
    // ! Method Signature: Method Name + Parameters 
    public Order getOrder(int orderId) {
        for (Order o : this.orders) {
            if (o.getID() == orderId) 
                return o; 
        }
        return null; 
    }

    public static void main(String[] args) {
        // customer
        // order 
        // getOrders
        // ! setOrders
    }
}
