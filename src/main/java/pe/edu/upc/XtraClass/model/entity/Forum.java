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
@Table(name = "Forum")
public class Forum { 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Forum_ID", columnDefinition="NUMERIC(6)")
	 private Integer forumId;

	 @Column(name="Issue", length = 25)
	 private String issue;
		 
	 @Column(name="Comment", length = 255)
	 private String comment;
	 
	 @ManyToOne
	 @JoinColumn(name = "Student_ID", nullable = false)
	 private Student student;
	
	public Forum(Integer forumId, String issue, String comment, Student student) {
	super();
	this.forumId = forumId;
	this.issue = issue;
	this.comment = comment;
	this.student = student;
	}

	public Integer getForumId() {
		return forumId;
	}

	public void setForumId(Integer forumId) {
		this.forumId = forumId;
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
	 
	 
