package boogy.ejada;

import javax.persistence.*;

@Entity
@Table (name= "MH_Places2")
public class MH_Places {
	@Id @GeneratedValue
	private long id;
	private String placeName;
	private int phone ;
	
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
