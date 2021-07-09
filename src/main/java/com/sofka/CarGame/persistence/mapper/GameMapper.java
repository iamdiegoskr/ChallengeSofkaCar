package com.sofka.CarGame.persistence.mapper;

import com.sofka.CarGame.domain.model.Game;
import com.sofka.CarGame.persistence.entity.GameEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GameMapper {

    @Mappings({
            @Mapping(source = "numberPlayers", target = "numberOfPlayers"),
            @Mapping(source = "distance", target = "distanceKM")
    })
    Game toGame(GameEntity game);

    @InheritInverseConfiguration
    @Mapping(target = "podium", ignore = true)
    GameEntity toGameEntity(Game game);
}
