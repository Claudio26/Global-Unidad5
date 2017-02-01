package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>  {

		@Query("select location from Location location")
		public List<Location> finAll();
	}

