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
@Table(name = "card")
public class Card { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private Integer id;
	
	@Column(name = "nro_card", length = 16, nullable = false)
	private String nroCard;
	
	@Column(name = "owner", length = 40, nullable = false)
	private String owner;
	
	@Column(name = "ccv", columnDefinition = "NUMERIC(3)")
	private Integer ccv;
	
	@OneToMany(mappedBy="card",fetch= FetchType.LAZY)
	private List<Student> student;
	
	// -- Constructor, Getter, Setter
	public Card() {
		student = new ArrayList<Student>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNroCard() {
		return nroCard;
	}

	public void setNroCard(String nroCard) {
		this.nroCard = nroCard;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getCcv() {
		return ccv;
	}

	public void setCcv(Integer ccv) {
		this.ccv = ccv;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudents(List<Student> student) {
		this.student = student;
	}
	
	
}
