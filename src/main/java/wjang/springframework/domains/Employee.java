package wjang.springframework.domains;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id @GeneratedValue Long id;
	@Version Integer version;
	String firstname;
	String lastname;
	String role;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	Manager manager;
	
	private Employee() { /* why JPA */ }
	
	public Employee(String firstName, String lastName, String role, Manager manager) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.role = role;
		this.manager = manager;
	}

	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstName) {
//		this.firstname = firstName;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public Manager getManager() {
//		return manager;
//	}
//
//	public void setManager(Manager manager) {
//		this.manager = manager;
//	}
//
//	public Integer getVersion() {
//		return version;
//	}
//
//	public void setVersion(Integer version) {
//		this.version = version;
//	}
}
