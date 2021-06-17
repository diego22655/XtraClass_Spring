package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
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

@Entity
@Table(name = "Subject_Teacher")
public class SubjectTeacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_ID",nullable = false)
	private Integer TeacherID;
	
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
	
	//-- Constructor, Getter, Setter
	public SubjectTeacher() {
		profile = new ArrayList<Profile>();
	}

	public Integer getTeacherID() {
		return TeacherID;
	}

	public void setTeacherID(Integer teacherID) {
		TeacherID = teacherID;
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
	
	
}
