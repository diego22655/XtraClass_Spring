package pe.edu.upc.XtraClass.model.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "Class_Reservation")
public class ClassReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStarTime() {
		return starTime;
	}

	public void setStarTime(Date starTime) {
		this.starTime = starTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ClassificationConsulting getClassification() {
		return Classification;
	}

	public void setClassification(ClassificationConsulting classification) {
		Classification = classification;
	}

	public List<Pay> getPayments() {
		return Payments;
	}

	public void setPayments(List<Pay> payments) {
		Payments = payments;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Column(name = "starTime", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date starTime; 
	
	@Column(name = "endTime", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endTime;
	
	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="Student_ID", nullable=false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "Classification_ID")
	private ClassificationConsulting Classification;
	

	@OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
	private List<Pay> Payments;
	
	@ManyToOne
	@JoinColumn(name= "Teacher_ID")
	private Teacher teacher;
}
