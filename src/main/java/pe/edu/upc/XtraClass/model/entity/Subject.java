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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "subjects", indexes = { @Index(columnList = "subject_name", name = "subjects_index_subject_name")})	
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id")
	private Integer id;
	
	@Column(name = "subject_name", length = 20)
	private String name;

	@OneToMany(mappedBy = "subject", fetch = FetchType.LAZY)
	private List<SubjectTeacher> subjectTeacher;
	
	// -- Constructor, Getter, Setter
	public Subject() {
		subjectTeacher = new ArrayList<SubjectTeacher>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubjectTeacher> getSubjectTeacher() {
		return subjectTeacher;
	}

	public void setSubjectTeacher(List<SubjectTeacher> subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

}
