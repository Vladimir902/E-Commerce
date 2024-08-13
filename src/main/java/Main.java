import com.java.oop.ecommerce.orders.OrderService;
import com.java.oop.ecommerce.orders.Orders;
import com.java.oop.ecommerce.payments.CreditCardPayment;
import com.java.oop.ecommerce.payments.PayPalPayment;
import com.java.oop.ecommerce.payments.Payments;
import com.java.oop.ecommerce.products.Products;
import com.java.oop.ecommerce.products.ShoppingCart;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
//        Products p1 = new Products(1,"Laptop",599.99,"Electronics");
//        System.out.println(p1);
//
//        Payments creditCard = new CreditCardPayment(1,"TV",489.12);
//        Payments paypal = new PayPalPayment(2,"PS4",299.00);
//
//        creditCard.processPayment();
//        paypal.processPayment();
//        creditCard.Payed();
//        paypal.Payed();
//
//        OrderService service = new OrderService();
//        service.ordering();
//
//        Orders o1 = new Orders(3,"Jake", Collections.singletonList("TV,PC,smartphone"),1956.67,"Credit Card");
//        o1.placeOrder();
//
//            ShoppingCart s1 = new ShoppingCart();
//            s1.calculateTotalCost();
//
//        List<String> products = Arrays.asList("Laptop", "Smartphone", "Headphones");
//        Orders ordering = new Orders(1,"Vladimir", products, 506.11,"credit card");
//        ordering.ordering();


        Scanner scanner = new Scanner(System.in);

        // Create a Product object
        Products product = new Products(3, "TV","Electronics");

        // Prompt the user to enter the quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        product.setQuantity(quantity); // Set the quantity using the setter

        // Prompt the user to enter the unit price
        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();
        product.setUnitPrice(unitPrice); // Set the unit price using the setter

        // Display the total price
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Unit Price: $" + product.getUnitPrice());
        System.out.println("Total Price: $" + product.getTotalPrice());






    }
}
