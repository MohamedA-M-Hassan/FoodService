package boogy.ejada;
import javax.persistence.*;
import java.util.*;
@Entity(name="MH_ORDER_VIEW")

public class MH_OrderView {
	
	@Id
	@Column (name="ORDER_ID")
	private Long orderId;
	
	@Column (name = "USER_ID")
	private long userId;
	
	@Column (name ="PLACE_ID")
	private long placeId;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	@Column (name ="OWNER_NAME")
	private String ownerName;
	
	
	@Column (name= "PLACE_NAME")
	private String place;
	
	//@Lob
	@Column(name = "STATUS")
	private String status;
	
	@Column (name="ORDER_DATE")
	private Date orderDate;
	
	@Column (name="ORDER_NAME")
	private String orderName;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}
