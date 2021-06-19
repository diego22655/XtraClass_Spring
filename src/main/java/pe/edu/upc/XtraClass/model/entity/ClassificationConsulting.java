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
@Table (name = "Classification_Consulting")
public class ClassificationConsulting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Classification_ID")
	private Integer id;

	@Column(name = "last_name", length = 10)
	private Integer NameClassification;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private ClassReservation Classification;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNameClassification() {
		return NameClassification;
	}

	public void setNameClassification(Integer nameClassification) {
		NameClassification = nameClassification;
	}

	public ClassReservation getClassification() {
		return Classification;
	}

	public void setClassification(ClassReservation classification) {
		Classification = classification;
	}
	
	// -- Constructor, Getter, Setter
	
}
