package boogy.ejada;

import javax.persistence.*;

@Entity
@Table(name= "MH_OrderItems2")
public class MH_OrderItems {
	
	@Id @GeneratedValue
	private long id;
	private int count;
	
	
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
