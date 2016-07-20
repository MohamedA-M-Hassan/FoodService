package boogy.ejada;

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
	
	
	public long getUserId() {
		return id;
	}
	public void setUserId(long userId) {
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