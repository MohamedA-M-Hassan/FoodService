package boogy.ejada;

import javax.persistence.*;

@Entity
@Table (name = "MH_Menu2")
public class MH_Menu {
	@Id @GeneratedValue
	private long id;
	private String Name;
	@Lob
	private String description;
	private int price ;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
	
}
