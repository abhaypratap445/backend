package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name = "Role")
@Component
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	
	private String role;	
	private String userName;
	
	
	
	/**
	 * @param contactNumber the contactNumber to set
	 */
	
	
	
	public String getUserName() {
		return userName;
	}
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	
		
}
}