package de.tekup.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.project.Modele.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, String>{

}
