package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "Subjects", indexes = { @Index(columnList = "name", name = "Subject_index_name")})	
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Subject_id")
	private Integer id;
	
	@Column(name = "Subject_name", length = 20)
	private String name;

	@OneToMany(mappedBy = "Subject", fetch = FetchType.LAZY)
	private List<SubjectTeacher> SubjectTeacher;
	
	// -- Constructor, Getter, Setter
	public Subject() {
		SubjectTeacher = new ArrayList<SubjectTeacher>();
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
		return SubjectTeacher;
	}

	public void setSubjectTeacher(List<SubjectTeacher> subjectTeacher) {
		SubjectTeacher = subjectTeacher;
	}

}
