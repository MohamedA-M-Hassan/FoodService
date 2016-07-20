package boogy.ejada;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table (name = "MH_Order2")
public class Order {
	
	@Id @GeneratedValue
	private long id;
	
	private String status;
	private int orderDate;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private MH_User2 ownerUserId;
	
	@ManyToOne
	@JoinColumn(name="PLACE_ID")
	private MH_Places placeId;
	
	@OneToMany(mappedBy="orderId")
	private Collection<MH_OrderItems> orderItems = new ArrayList<MH_OrderItems>();
	
	
	public Collection<MH_OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Collection<MH_OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public MH_User2 getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(MH_User2 ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public MH_Places getPlaceId() {
		return placeId;
	}
	public void setPlaceId(MH_Places placeId) {
		this.placeId = placeId;
	}
	
	
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
