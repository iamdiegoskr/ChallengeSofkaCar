package com.sofka.CarGame.persistence;

import com.sofka.CarGame.persistence.crud.LaneCrudRepository;
import com.sofka.CarGame.persistence.entity.LaneEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LaneRepository {

    @Autowired
    private LaneCrudRepository repository;

    public List<LaneEntity> getLanesByTrack(int idTrack){
        return repository.findByIdTrack(idTrack);
    }




}
