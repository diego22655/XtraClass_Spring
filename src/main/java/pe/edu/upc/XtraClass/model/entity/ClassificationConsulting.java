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
@Table (name = "Classification_Consulting")
public class ClassificationConsulting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Classification_ID")
	private Integer id;

	@Column(name = "last_name", length = 10)
	private String NameClassification;
	
	@OneToMany(mappedBy = "Classification", fetch = FetchType.LAZY)
	private List<ClassReservation> reservation;
	
	// -- Constructor, Getter, Setter
	public ClassificationConsulting() {
		reservation = new ArrayList<ClassReservation>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameClassification() {
		return NameClassification;
	}

	public void setNameClassification(String NameClassification) {
		this.NameClassification = NameClassification;
	}

	public List<ClassReservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<ClassReservation> reservation) {
		this.reservation = reservation;
	}
	

}
