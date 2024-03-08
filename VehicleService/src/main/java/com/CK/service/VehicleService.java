package com.CK.service;

import com.CK.dto.request.AddVehicleRequestDto;
import com.CK.dto.response.VehicleResponseDto;
import com.CK.entity.Vehicle;
import com.CK.exception.ErrorType;
import com.CK.exception.VehicleManagerException;
import com.CK.mapper.VehicleMapper;
import com.CK.repository.VehicleRepository;
import com.CK.utility.enums.EVehicleStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public Boolean addVehicle(AddVehicleRequestDto dto) {
        Vehicle vehicle = vehicleMapper.fromAddVehicleRequestDtoToVehicle(dto);
        vehicleRepository.save(vehicle);
        return true;
    }

    public List<VehicleResponseDto> findAllAvailableByLocation(String location) {
        List<Vehicle> availableVehicles = vehicleRepository.findByLocationAndStatus(location,EVehicleStatus.AVAILABLE); // <Optional>
        if (availableVehicles.isEmpty()) {
            throw new VehicleManagerException(ErrorType.NO_AVAILABLE_VEHICLES_FOUND);
        }
        return availableVehicles.stream().map(vehicle -> vehicleMapper.INSTANCE.fromVehicleToVehicleResponseDto(vehicle)).toList();
    }

    public Boolean rentCar(Long carId) {
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(carId);
        if (optionalVehicle.isEmpty()) {
            throw new VehicleManagerException(ErrorType.VEHICLE_NOT_FOUND);
        }
        Vehicle vehicle = optionalVehicle.get();
        vehicle.setStatus(EVehicleStatus.RENTED);
        vehicleRepository.save(vehicle);
        return true;
    }
}
