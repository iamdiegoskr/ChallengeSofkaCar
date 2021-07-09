package com.sofka.CarGame.persistence.mapper;

import com.sofka.CarGame.domain.model.Car;
import com.sofka.CarGame.domain.model.Driver;
import com.sofka.CarGame.persistence.entity.CarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DriverMapper.class})
public interface CarMapper {

    @Mappings({
        @Mapping(source = "model",target = "modelYear")
    })
    Car toCar(CarEntity car);
    List<Car> toCars(List<CarEntity> cars);

    @InheritInverseConfiguration
    @Mapping(target = "lane", ignore = true)
    CarEntity toCarEntity(Car car);

}
