package boogy.ejada;

import javax.persistence.*;

@Entity(name = "MH_ORDER_ITEM_VIEW")

public class MH_OrderItemView {
	@Id
	//TODO add id 
	@Column(name="ORDER_ID")
    private Long orderID ;
    
	@Column(name="PLACE_NAME")
    private String placeName ;
    
	@Column(name="USER_NAME")
    private String userName;
    
	@Column(name="COUNT")
    private long count;
    
	@Column(name="PRICE")
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }
}
