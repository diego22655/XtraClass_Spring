package pe.edu.upc.XtraClass.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Profile_ID")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name= "subject_id")
	private SubjectTeacher subjectTeacher;
	
	@ManyToOne
	@JoinColumn(name= "teacher_id")
	private SubjectTeacher teachers;
	
	// -- Getter, Setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPersona(Person person) {
		this.person = person;
	}

	public SubjectTeacher getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(SubjectTeacher subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

	public SubjectTeacher getTeachers() {
		return teachers;
	}

	public void setTeachers(SubjectTeacher teachers) {
		this.teachers = teachers;
	}
	
	
}
