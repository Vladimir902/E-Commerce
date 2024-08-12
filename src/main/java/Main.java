import com.java.oop.ecommerce.orders.OrderService;
import com.java.oop.ecommerce.payments.CreditCardPayment;
import com.java.oop.ecommerce.payments.PayPalPayment;
import com.java.oop.ecommerce.payments.Payments;
import com.java.oop.ecommerce.products.Products;

public class Main {

    public static void main(String args[]) {
        Products p1 = new Products(1,"Laptop",599.99,"Electronics");

        System.out.println(p1);

        Payments creditCard = new CreditCardPayment(1,"TV",489.12);
        Payments paypal = new PayPalPayment(2,"PS4",299.00);

        creditCard.processPayment();
        paypal.processPayment();
        creditCard.Payed();
        paypal.Payed();

        OrderService service = new OrderService();
        service.ordering();
    }
}
