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
	@Column(name = "person_id")
	private Integer person_id;
	
	@Column(name = "firstName", length = 20, nullable = false)
	private String firstName;
	
	@Column(name = "lastName", length = 20, nullable = false)
	private String lastName;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "password", length = 12, nullable = false)
	private String password;
	 
	@Column(name = "birth", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private List<Student> students;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private List<Teacher> teachers;
	
	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
	private List<Profile> profiles;
	
	// -- Constructor, Getter, Setter
	public Person() {
		students = new ArrayList<Student>();
		teachers = new ArrayList<Teacher>();
		profiles = new ArrayList<Profile>();
	}

	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
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

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
}
