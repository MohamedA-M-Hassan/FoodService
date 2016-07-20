package boogy.ejada;

import javax.persistence.*;

@Entity
@Table(name= "MH_OrderItems2")
public class MH_OrderItems {
	
	@Id @GeneratedValue
	private long id;
	private int count;
	
	@ManyToOne
	@JoinColumn (name="ORDER_ID")
	private Order orderId;
	
	@ManyToOne
	@JoinColumn (name="MENU_ID")
	private MH_Menu menuId;
	
	@ManyToOne
	@JoinColumn (name="USER_ID")
	private MH_User2 userId;
	
	public Order getOrderId() {
		return orderId;
	}
	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
	public MH_Menu getMenuId() {
		return menuId;
	}
	public void setMenuId(MH_Menu menuId) {
		this.menuId = menuId;
	}
	public MH_User2 getUserId() {
		return userId;
	}
	public void setUserId(MH_User2 userId) {
		this.userId = userId;
	}
	public long getId() {
		return id;
	}
	public void setId(long orderItemsId) {
		this.id = orderItemsId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
