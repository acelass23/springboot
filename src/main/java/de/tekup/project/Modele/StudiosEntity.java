package de.tekup.project.Modele;

import java.util.List; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
public class StudiosEntity {

	@Id
	@Column(length = 250)
	private String name;
	@Column(length = 30)
	private String addrese;
	@OneToMany(mappedBy = "studios")
	@JsonIgnore
	private List<MovieEntity> movie;
}
