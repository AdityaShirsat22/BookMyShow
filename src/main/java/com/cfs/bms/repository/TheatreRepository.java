package com.cfs.bms.repository;

import com.cfs.bms.model_entity.Showseat;
import com.cfs.bms.model_entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre,Long> {

    List<Theatre> findByShowId(String city);

    
}
