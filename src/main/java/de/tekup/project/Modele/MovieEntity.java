package de.tekup.project.Modele;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data

public class MovieEntity {
	
	@Id
	@Column(length = 250)
	private String title;
	@Column(length = 11)
    private int year;
	@Column(length = 11)
	private LocalTime length;
	@Column(length = 11)
	private int color ;
	@ManyToOne()
	@JoinColumn(name="studio")
	private StudiosEntity studios;
	@ManyToMany(mappedBy = "movies")
	private List<StarsEntity> star;
	
	
	public void setsalmouta(loctalTime length) {
		
		this.salmouta=length;
				
	}
	
}
