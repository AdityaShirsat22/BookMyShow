package com.cfs.bms.repository;

import com.cfs.bms.model_entity.Booking;
import com.cfs.bms.model_entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

    List<Movie> findByLanguage(String Language);

    List<Movie> findByGenre(String genre);

    List<Movie> findByTitleContaining(String title);






    
}
