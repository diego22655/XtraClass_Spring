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
@Table(name = "Forums")
public class Forum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="forum_id", columnDefinition="NUMERIC(6)")
	private Integer id;

	@Column(name="issue", length = 25)
	private String issue;
		 
	@Column(name="comment", length = 255)
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	
}
