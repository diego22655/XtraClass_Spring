package pe.edu.upc.XtraClass.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Forums", indexes = {@Index( columnList = "issue", name = "forum_Issue")})
public class Forum { 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="forum_ID", columnDefinition="NUMERIC(6)")
	 private Integer forumId;

	 @Column(name="issue", length = 25)
	 private String issue;
		 
	 @Column(name="comment", length = 255)
	 private String comment;
	 
	 @ManyToOne
	 @JoinColumn(name = "student_ID", nullable = false)
	 private Student student;
	
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
}	 
	 
