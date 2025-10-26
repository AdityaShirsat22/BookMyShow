package com.cfs.bms.repository;

import com.cfs.bms.model_entity.Show;
import com.cfs.bms.model_entity.ShowSeat;
import com.cfs.bms.model_entity.Showseat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {

    List<ShowSeat> findBySHowId(Long movieId);

    List<ShowSeat> findByShowIdAndStatus(Long ShowId,String status);

    
}
