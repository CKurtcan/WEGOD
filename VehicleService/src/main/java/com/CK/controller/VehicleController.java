package com.CK.controller;

import com.CK.dto.request.AddVehicleRequestDto;
import com.CK.dto.response.VehicleResponseDto;
import com.CK.entity.Vehicle;
import com.CK.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.CK.constant.RestApiUrls.*;

@RestController
@RequestMapping(VEHICLE)
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping(ADD_VEHICLE)
    public ResponseEntity<Boolean> addVehicle(@RequestBody AddVehicleRequestDto dto) {
        return ResponseEntity.ok(vehicleService.addVehicle(dto));
    }

    @GetMapping(FIND_NEARBY_VEHICLE)
    public ResponseEntity<List<VehicleResponseDto>> findNearbyVehicle(@RequestParam String location) {
        return ResponseEntity.ok(vehicleService.findAllAvailableByLocation(location));
    }

    @PostMapping(RENT_CAR)
    public ResponseEntity<Boolean> rentCar(@RequestParam Long carId) {
        return ResponseEntity.ok(vehicleService.rentCar(carId));
    }
}
