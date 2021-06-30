package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "teachers")
public class Teacher {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
    private Integer id;

    @Column(name = "AccountNumber", length = 20, nullable = false)
    private String AccountNumber;
    
    @ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
    
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private List<ClassReservation> Reservations;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private List<SubjectTeacher> subjectTeacher;
    
    // -- Constructor, Getter, Setter
    public Teacher() {
    	Reservations = new ArrayList<ClassReservation>();
    	subjectTeacher = new ArrayList<SubjectTeacher>();
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<ClassReservation> getReservations() {
		return Reservations;
	}

	public void setReservations(List<ClassReservation> reservations) {
		Reservations = reservations;
	}

	public List<SubjectTeacher> getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(List<SubjectTeacher> subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

	

}
