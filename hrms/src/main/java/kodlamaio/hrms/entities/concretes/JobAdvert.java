package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_adverts")
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvert {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@Column(name = "employer_id")
	//private int employerId;
	
	//@Column(name = "city_id")
	//private int cityId;
	
	//@Column(name = "job_position_id")
	//private int jobPositionId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary")
	private int salary;
	
	@Column(name = "position_count")
	private int positionCount;
	
	@Column(name = "airdate")
	private LocalDate airdate = LocalDate.now();
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "is_active")
	private boolean isActive = true;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition; 
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;

}
