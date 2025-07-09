package vn.toannvs.laptopshop.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    private long id;
    private double totalPrice;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
