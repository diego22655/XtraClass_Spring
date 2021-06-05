package pe.edu.upc.XtraClass.model.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "Class_Reservation")
public class ClassReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id")
	private Integer id;
	
	@Column(name = "starTime", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date starTime; 
	
	@Column(name = "endTime", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endTime;
	
	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="Student_ID", nullable=false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "Classification_ID")
	private ClassificationConsulting Classification;
	

	@OneToMany(mappedBy = "reservacion", fetch = FetchType.LAZY)
	private List<Pay> Payments;
	
	@ManyToOne
	@JoinColumn(name= "Teacher_ID")
	private Teacher teacher;
}
