package iuh.fit.se.SpringDataJPA_NHQ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_employee")
public class Employee {
	@Id
	@GeneratedValue
	private long EmployeeID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	public Employee(long employeeID, String firstName, String lastName, String email) {
		super();
		EmployeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Employee() {
		super();
	}

	public long getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(long employeeID) {
		EmployeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}

}
