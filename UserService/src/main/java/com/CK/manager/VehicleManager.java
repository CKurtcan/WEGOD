package com.CK.manager;

import com.CK.dto.response.VehicleResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.CK.constant.RestApiUrls.FIND_NEARBY_VEHICLE;

@FeignClient(url = "http://localhots:6062/dev/v1/vehicle", name = "user-vehicle")
public interface VehicleManager {

    @GetMapping(FIND_NEARBY_VEHICLE)
    public ResponseEntity<List<VehicleResponseDto>> findNearbyVehicle(@RequestParam String location);
}
