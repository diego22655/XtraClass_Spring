package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "firstName", length = 20)
	private String firstName;
	
	@Column(name = "lastName", length = 20)
	private String lastName;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "password", length = 12)
	private String password;
	 
	@Column(name = "birth")
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private List<Student> students;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private List<Teacher> teachers;
	
	public Person() {
		students = new ArrayList<Student>();
		teachers = new ArrayList<Teacher>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
}
