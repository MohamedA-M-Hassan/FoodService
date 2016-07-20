package boogy.ejada;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table (name= "MH_Places2")
public class MH_Places {
	@Id @GeneratedValue
	private long id;
	private String placeName;
	private int phone ;
	
	@OneToMany(mappedBy="placeId")
	private Collection<Order> Order = new ArrayList<Order>() ;
	
	@OneToMany(mappedBy="placeId")
	private Collection<MH_Menu> menu = new ArrayList<MH_Menu>() ;
	
	public Collection<MH_Menu> getMenu() {
		return menu;
	}
	public void setMenu(Collection<MH_Menu> menu) {
		this.menu = menu;
	}
	public Collection<Order> getOrder() {
		return Order;
	}
	public void setOrder(Collection<Order> order) {
		Order = order;
	}
	public long getId() {
		return id;
	}
	public void setId(long placeId) {
		this.id = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
