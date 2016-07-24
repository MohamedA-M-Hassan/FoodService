package boogy.ejada;
import javax.persistence.*;
import java.util.*;
@Entity(name="MH_ORDER_VIEW")

public class MH_OrderView {
	
	@Id
	@Column (name="ORDER_ID")
	private Long orderId;
	
	@Column (name ="OWNER_NAME")
	private String ownerName;
	
	@Column (name= "PLACE_NAME")
	private String place;
	
	//@Lob
	@Column(name = "STATUS")
	private String status;
	
	@Column (name="ORDER_DATE")
	private Date orderDate;

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
