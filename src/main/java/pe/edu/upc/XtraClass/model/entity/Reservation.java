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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer id;
	
	@Column(name = "startTime")
	private String startTime; 
	
	@Column(name = "endTime")
	private String endTime;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="student_id", nullable=false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name= "teacher_id")
	private Teacher teacher;
	
	@OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
	private List<Qualification> qualifications;
	
	@OneToMany(mappedBy = "reservation", fetch = FetchType.LAZY)
	private List<Pay> pays;
	
	@ManyToOne
	@JoinColumn(name="scheadule_id")
	private Scheadule scheadule;

	public Reservation() {
		qualifications = new ArrayList<Qualification>();
		pays = new ArrayList<Pay>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}

	public List<Pay> getPays() {
		return pays;
	}

	public void setPays(List<Pay> pays) {
		this.pays = pays;
	}

	public Scheadule getScheadule() {
		return scheadule;
	}

	public void setScheadule(Scheadule scheadule) {
		this.scheadule = scheadule;
	}

	
	
}
