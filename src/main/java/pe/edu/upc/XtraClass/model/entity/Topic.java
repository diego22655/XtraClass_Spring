package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
import java.util.List;

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
	@JoinColumn(name="card_id")
	private Card card;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
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
	
	
	public Card getCard() {
		return card;
	}


	public void setCard(Card card) {
		this.card = card;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Incidence> getIncidences() {
		return incidences;
	}

	public void setIncidences(List<Incidence> incidences) {
		this.incidences = incidences;
	}

	public List<Forum> getForums() {
		return forums;
	}

	public void setForums(List<Forum> forums) {
		this.forums = forums;
	}

	public List<ClassReservation> getClassReservation() {
		return classReservation;
	}

	public void setClassReservation(List<ClassReservation> classReservation) {
		this.classReservation = classReservation;
	}
	
	public void setTarjeta(Card card) {
		this.card = card;
	}

	public List<Incidence> getIncidencias() {
		return incidences;
	}

	public void setIncidencias(List<Incidence> incidencias) {
		this.incidences = incidencias;
	}

	public List<Forum> getForos() {
		return forums;
	}

	public void setForos(List<Forum> foros) {
		this.forums = foros;
	}

	public List<ClassReservation> getReservaClase() {
		return classReservation;
	}

	public void setReservaClase(List<ClassReservation> reservaClase) {
		this.classReservation = reservaClase;
	}

	
	

}
	

