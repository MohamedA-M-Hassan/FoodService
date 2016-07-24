package boogy.ejada;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table (name = "MH_Menu2")
public class MH_Menu {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_generator")
	@SequenceGenerator(name = "seq_generator", sequenceName = "MH_ID_SEQUENCE",allocationSize=1)
	private long id;
	private String Name;
	
	@Lob
	private String description;
	
	private double price ;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="menuId")
	private Collection<MH_OrderItems> orderItems = new ArrayList<MH_OrderItems>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PLACE_ID")
	private MH_Places placeId;

	public MH_Places getPlaceId() {
		return placeId;
	}
	public void setPlaceId(MH_Places placeId) {
		this.placeId = placeId;
	}
	public Collection<MH_OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Collection<MH_OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public long getId() {
		return id;
	}
	public void setId(long itemId) {
		this.id = itemId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	
}
