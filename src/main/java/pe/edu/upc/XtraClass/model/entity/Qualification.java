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
@Table (name = "Qualifications")
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qualification_id")
	private Integer id;

	@Column(name = "name_qualification", length = 10)
	private String nameQualification;
	
	@ManyToOne
	@JoinColumn(name="reservation_id")
	private Reservation reservation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameQualification() {
		return nameQualification;
	}

	public void setNameQualification(String nameQualification) {
		this.nameQualification = nameQualification;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
}
