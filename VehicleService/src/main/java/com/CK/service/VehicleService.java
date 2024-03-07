package com.CK.service;

import com.CK.dto.request.AddVehicleRequestDto;
import com.CK.entity.Vehicle;
import com.CK.exception.ErrorType;
import com.CK.exception.VehicleManagerException;
import com.CK.repository.VehicleRepository;
import com.CK.utility.enums.EVehicleStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public Boolean addVehicle(AddVehicleRequestDto dto) {
        Vehicle vehicle = Vehicle.builder()
            .brand(dto.getBrand())
            .model(dto.getModel())
            .fuelType(dto.getFuelType())
            .transmissionType(dto.getTransmissionType())
            .age(dto.getAge())
            .km(dto.getKm())
            .deposit(dto.getDeposit())
            .price(dto.getPrice())
            .location(dto.getLocation())
            .about(dto.getAbout())
            .image(dto.getImage())
            .build(); //mapper işlemi ile sağdeleştirilecek
        vehicleRepository.save(vehicle);
        return true;
    }

//    public Optional<Vehicle> findByLocation(String location) {
//        List<Vehicle> vehiclesList = new ArrayList<>();
//        if (vehicleRepository.findByLocation(location).isEmpty()) {
//            throw new VehicleManagerException(ErrorType.VEHICLE_NOT_FOUND);
//        }
//        Optional<Vehicle> optionalVehicle = vehicleRepository.findByLocation(location);
//        if (optionalVehicle.get().getStatus().equals(EVehicleStatus.FREE)){
//            vehiclesList.addAll(optionalVehicle.get().getVehiclesList());
//        }
//        return null;
//    }
}
