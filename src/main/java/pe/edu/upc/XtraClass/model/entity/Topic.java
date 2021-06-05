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
@Table(name = "topics")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "namTopic", length = 15, nullable = false)
	private String namTopic;
	
	@Column(name = "description", length = 120)
	private String description;
	
	@OneToMany(mappedBy = "topic", fetch = FetchType.LAZY)
	private List<Incidence> incidences;
	
	public Topic() {
		incidences = new ArrayList<Incidence>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamTopic() {
		return namTopic;
	}

	public void setNamTopic(String namTopic) {
		this.namTopic = namTopic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
