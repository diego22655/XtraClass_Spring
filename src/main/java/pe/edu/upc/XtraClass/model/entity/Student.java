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
@Table(name = "Students")
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
	private List<Reservation> reservations;
	
	
	public Student() {
		incidences = new ArrayList<Incidence>();
		forums = new ArrayList<Forum>();
		reservations = new ArrayList<Reservation>();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Card getCard() {
		return card;
	}


	public void setCard(Card card) {
		this.card = card;
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


	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
}
