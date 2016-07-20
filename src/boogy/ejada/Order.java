package boogy.ejada;

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
	//private MH_Places placeId;
	public MH_User2 getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(MH_User2 ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	/*public MH_Places getPlaceId() {
		return placeId;
	}
	public void setPlaceId(MH_Places placeId) {
		this.placeId = placeId;
	}*/
	
	//private MH_User2 userId;
	/*public MH_User2 getUserId() {
		return userId;
	}
	public void setUserId(MH_User2 userId) {
		this.userId = userId;
	}*/
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
