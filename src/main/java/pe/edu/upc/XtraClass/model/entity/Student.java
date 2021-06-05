package pe.edu.upc.XtraClass.model.entity;

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
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
   	private Person person;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	private List<Incidence> incidences;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    	private List<Forum> forums;
	
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	private List<ClassReservation> classReservation;
	
	public Student() {
		incidences = new ArrayList<Incidence>();
		forums = new ArrayList<Forum>();
		classReservation = new ArrayList<ClassReservation>();
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	

}
