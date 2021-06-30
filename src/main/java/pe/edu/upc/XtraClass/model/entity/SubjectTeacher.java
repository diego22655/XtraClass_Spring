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
@Table(name = "subjectteachers")
public class SubjectTeacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_ID",nullable = false)
	private Integer teacherID;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_ID",nullable = false)
	private Integer subjectID;
	
	@OneToMany(mappedBy = "subjectTeacher", fetch = FetchType.LAZY)
	private List<Profile> profile;
	
	@ManyToOne
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name = "teacher_ID", insertable = false, updatable = false)
	private Teacher teacher;
	
	@Column(name = "day", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date day;
	
	@Column(name = "start_hour",nullable = false)
	private String starthour;
	
	@Column(name="finish_hour",nullable=false)
	private String finishhour;
	
	//-- Constructor, Getter, Setter
	public SubjectTeacher() {
		profile = new ArrayList<Profile>();
	}
	public Integer getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(Integer teacherID) {
		this.teacherID = teacherID;
	}
	public Integer getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}
	public List<Profile> getProfile() {
		return profile;
	}
	public void setProfile(List<Profile> profile) {
		this.profile = profile;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getStarthour() {
		return starthour;
	}
	public void setStarthour(String starthour) {
		this.starthour = starthour;
	}
	public String getFinishhour() {
		return finishhour;
	}
	public void setFinishhour(String finishhour) {
		this.finishhour = finishhour;
	}	
}
