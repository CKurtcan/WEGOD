package com.CK.mapper;

import com.CK.dto.request.AddVehicleRequestDto;
import com.CK.dto.response.VehicleResponseDto;
import com.CK.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehicleMapper {

    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    VehicleResponseDto fromVehicleToVehicleResponseDto(final Vehicle vehicle);

    Vehicle fromAddVehicleRequestDtoToVehicle(final AddVehicleRequestDto dto);
}
