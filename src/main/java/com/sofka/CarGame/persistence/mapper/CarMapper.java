package com.sofka.CarGame.persistence.mapper;

import com.sofka.CarGame.domain.model.Car;
import com.sofka.CarGame.persistence.entity.CarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mappings({
        @Mapping(source = "model",target = "modelYear")
    })
    Car toCar(CarEntity car);

    @InheritInverseConfiguration
    CarEntity toCarEntity(Car car);

}
