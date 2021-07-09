package com.sofka.CarGame.persistence.mapper;

import com.sofka.CarGame.domain.model.Driver;
import com.sofka.CarGame.persistence.entity.DriverEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    @Mappings({
            @Mapping(source = "nameDriver", target = "name")
    })
    Driver toDriver(DriverEntity driver);


    @InheritInverseConfiguration
    @Mapping(target = "car", ignore = true)
    DriverEntity toDriverEntity(Driver driver);

}
