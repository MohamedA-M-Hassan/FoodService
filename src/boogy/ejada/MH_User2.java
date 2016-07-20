package boogy.ejada;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
@Entity
@Table (name= "MH_USER2",uniqueConstraints=@UniqueConstraint (columnNames={"UserName"}))

public class MH_User2 {
	@Id @GeneratedValue
	private long id;
	
	@Column (name="Passward")
	private String pass;
	
	@Column (name="UserName")
	private String userName;
	
	@Column (name="Name")
	private String name;
	
	@Column (name="PhoneNum")
	private int phone;
	
	@OneToMany(mappedBy="ownerUserId")
	// trial 
	//@JoinTable(joinColumns= @JoinColumn( name="User_ID")
	//, inverseJoinColumns=@JoinColumn(name="ORDER_ID"))
	private Collection<Order> order = new ArrayList<Order>() ;
	
	@OneToMany(mappedBy="userId")
	private Collection<MH_OrderItems> orderItems = new ArrayList<MH_OrderItems>();
	
	public Collection<MH_OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Collection<MH_OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	public Collection<Order> getOrder() {
		return order;
	}
	public void setOrder(Collection<Order> order) {
		order = order;
	}
	public long getId() {
		return id;
	}
	public void setId(long userId) {
		this.id = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
