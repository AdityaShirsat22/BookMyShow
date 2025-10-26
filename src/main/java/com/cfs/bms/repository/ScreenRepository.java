package com.cfs.bms.repository;

import com.cfs.bms.model_entity.Payment;
import com.cfs.bms.model_entity.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Long> {

    List<Screen> findByTheatreId (Long theatre);
    

    




    
}
