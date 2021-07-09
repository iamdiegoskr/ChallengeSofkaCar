package com.sofka.CarGame.persistence.crud;

import com.sofka.CarGame.persistence.entity.LaneEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LaneCrudRepository extends CrudRepository<LaneEntity,Integer> {

    //Query Method

    //Get All Lanes by Track
    List<LaneEntity> findByIdTrack(int idTrack);

}
