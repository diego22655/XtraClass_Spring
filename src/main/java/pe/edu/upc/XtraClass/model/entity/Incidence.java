package pe.edu.upc.XtraClass.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Incidences")
public class Incidence {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Incidence_id", nullable=false)
	private Integer incidenceId;
	
	@Column(name="Description", length=120, nullable = false)
	private String description;
	
	@Column(name = "Problem", length = 120, nullable = false)
	private String problem;
	
	@Column(name = "Date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="Student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="Topic_id")
	private Topic topic;

	public Integer getIncidenceId() {
		return incidenceId;
	}

	public void setIncidenceId(Integer incidenceId) {
		this.incidenceId = incidenceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	

	