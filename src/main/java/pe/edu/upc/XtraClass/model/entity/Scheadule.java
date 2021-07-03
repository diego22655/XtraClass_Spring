package pe.edu.upc.XtraClass.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Scheadules")
public class Scheadule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "day", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date day;
	
	@Column(name = "start_hour",nullable = false)
	private String starthour;
	
	@Column(name="finish_hour",nullable=false)
	private String finishhour;

	@OneToMany(mappedBy = "scheadule", fetch = FetchType.LAZY)
	private List<Reservation> reservations;
	
	public Scheadule() {
		reservations = new ArrayList<Reservation>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public String getStarthour() {
		return starthour;
	}

	public void setStarthour(String starthour) {
		this.starthour = starthour;
	}

	public String getFinishhour() {
		return finishhour;
	}

	public void setFinishhour(String finishhour) {
		this.finishhour = finishhour;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
