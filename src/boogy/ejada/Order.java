package boogy.ejada;

import javax.persistence.*;

@Entity
@Table (name = "MH_Order2")
public class Order {
	@Id @GeneratedValue
	private long id;
	private String status;
	private int orderDate;
	
	public long getId() {
		return id;
	}
	public void setId(long orderId) {
		this.id = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
