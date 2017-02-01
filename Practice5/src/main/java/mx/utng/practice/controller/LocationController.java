package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.repository.LocationRepository;

import mx.utng.practice.model.Location;


@Named
@ViewScoped
public class LocationController {
	
		
		@Autowired
		private LocationRepository LocationRepository;
		private Location location = new Location();
	   private List<Location> locations;
	   private boolean editMode = false;
	   

	@PostConstruct
		public void init(){
		   setLocations(LocationRepository.finAll());
		}
		public void save(){
			LocationRepository.save(location);
			if(!editMode){
			 getLocations().add(location);
			}
			
			location = new Location();
			setEditMode(false);
			
			}
		
		public void delete(Location location){
			LocationRepository.delete(location);
			locations.remove(location);
		}
		
		public void update(Location location){
			setLocation(location);
			setEditMode(true);
		}
		public void cancel(){
			location = new Location();
			setEditMode(false);
		}
		
		
		
		public LocationRepository getLocationRepository() {
			return LocationRepository;
		}
		public void setLocationRepository(LocationRepository locationRepository) {
			LocationRepository = locationRepository;
		}
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public List<Location> getLocations() {
			return locations;
		}
		public void setLocations(List<Location> locations) {
			this.locations = locations;
		}
		public boolean isEditMode() {
			return editMode;
		}
		public void setEditMode(boolean editMode) {
			this.editMode = editMode;
		}
		
	}
