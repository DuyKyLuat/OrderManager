package App_orders;
import java.util.List;
public class Order extends Product {
    int orderSerial;
    String orderDate;
    String orderedProdutcts;
    List<Product> products;

    public Order(int orderSerial, String orderDate, List<Product> products) {
        this.orderSerial = orderSerial;
        this.orderDate = orderDate;
        this.orderedProdutcts = orderedProdutcts;
        this.products = products;
    }
    public double calculateTotal(){
        double total = 0;
        for (Product product : products){
            total += product.price * product.quantity;
        }
        return total;
    }
}
