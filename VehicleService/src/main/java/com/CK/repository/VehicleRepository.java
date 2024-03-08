package com.CK.repository;

import com.CK.entity.Vehicle;
import com.CK.utility.enums.EVehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByLocationAndStatus(String location, EVehicleStatus status);

    List<Vehicle> findByLocation(String location);
}
