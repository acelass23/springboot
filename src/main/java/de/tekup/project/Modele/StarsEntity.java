package de.tekup.project.Modele;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class StarsEntity {

	
	
	@Id
	@Column(length = 50)
	private String name;
	@Column(length = 70)
	private String addrese;
	@Column(length = 1)
	private String gender;
	private LocalDate birthdate;
	@ManyToMany
	@JoinTable(name="Starsin")
	@JsonIgnore
	private List<MovieEntity> movies;
}
