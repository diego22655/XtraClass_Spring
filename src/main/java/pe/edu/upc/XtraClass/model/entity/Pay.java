package pe.edu.upc.XtraClass.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Pays")
public class Pay {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "pay_id", columnDefinition = "NUMERIC(6)")
	private Integer id;
	
	@Column(name = "PayDate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date PayDate;
	
	@ManyToOne
	@JoinColumn(name = "reservation_id")
	private ClassReservation reservation;
	
	// -- Getter, Setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public void setPayDate(Date payDate) {
		this.PayDate = payDate;
	}

	public ClassReservation getReservation() {
		return reservation;
	}

	public void setReservation(ClassReservation reservation) {
		this.reservation = reservation;
	}

	
	
}
