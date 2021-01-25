package de.tekup.project.Service;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import de.tekup.project.Modele.MovieEntity;
import de.tekup.project.Modele.StarsEntity;
import de.tekup.project.Modele.StudiosEntity;
import de.tekup.project.Repository.StarsRepositoy;
import de.tekup.project.Repository.StudiosRepository;

@Service
public class Starsservice {

	
	private StarsRepositoy repostar;
	private StudiosRepository repostudio;
@Autowired
	public Starsservice(StarsRepositoy repostar) {
		super();
		this.repostar = repostar;
	}
	
	
	public java.util.List<StudiosEntity> std(String name){
		
		java.util.List<StudiosEntity> studios= new ArrayList<>();
		
		Optional<StarsEntity> star = repostar.findById(name);
		
		if(star.isPresent()) {
			
		studios=star.get().getMovies().stream().map(movie->movie.getStudios()).collect(Collectors.toList());
		
		}else throw new 
			
		NoSuchElementException("no stat found with this name ");
		
		return studios;
		
	} 
	
	
	public java.util.List<MovieEntity> cloros (String name ){
		
		Optional<StudiosEntity> studio = repostudio.findById(name);
		
		java.util.List<MovieEntity>movies = new ArrayList<>();
		
		if(studio.isPresent()) {	
			for (MovieEntity movie:studio.get().getMovie()) {
				if (movie.getColor()==1) {
					movies.add(movie);
					
				}
			}
			
	}else throw new NoSuchElementException("no stat found with this name ");
	
	return movies;
	}}
