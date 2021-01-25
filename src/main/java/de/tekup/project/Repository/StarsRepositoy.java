package de.tekup.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.project.Modele.StarsEntity;

public interface StarsRepositoy  extends JpaRepository<StarsEntity, String>{

}
