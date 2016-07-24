package boogy.ejada;

import java.util.ArrayList;
import java.util.*;

import javax.persistence.*;

@Entity
@Table (name = "MH_Order2")
public class Order {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
	@SequenceGenerator(name = "seq_generator", sequenceName = "MH_ID_SEQUENCE",allocationSize=1)
	private long id;
	
	private String status;
	private Date orderDate;
	private String orderName;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private MH_User2 ownerUserId;
	
	@ManyToOne
	@JoinColumn(name="PLACE_ID")
	private MH_Places placeId;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="orderId")
	private Collection<MH_OrderItems> orderItems = new ArrayList<MH_OrderItems>();
	
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
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
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


}
