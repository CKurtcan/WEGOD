package com.CK.service;

import com.CK.dto.request.CreateUserRequestDto;
import com.CK.dto.request.RentCarRequestDto;
import com.CK.dto.request.UpdateRequestDto;
import com.CK.dto.response.VehicleResponseDto;
import com.CK.entity.UserProfile;
import com.CK.exception.ErrorType;
import com.CK.exception.UserManagerException;
import com.CK.manager.VehicleManager;
import com.CK.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final VehicleManager vehicleManager;
    public Boolean createUser(CreateUserRequestDto dto) {
        UserProfile user = UserProfile.builder()
                .authId(dto.getAuthId())
                .idNum(dto.getIdNum())
                .email(dto.getEmail())
                .username(dto.getUsername())
                .build();
        userRepository.save(user);
        return true;
    }

    public UserProfile updateUser(UpdateRequestDto dto) { // id si alınıp o id üzerindeki kullanıcı değerlerinde değişiklik yapılacak
        Optional<UserProfile> optionalUser = userRepository.findByAuthId(dto.getAuthId());
        if (optionalUser.isEmpty()) {
            throw new UserManagerException(ErrorType.USER_NOT_FOUND);
        }
        UserProfile user = optionalUser.get();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setCountry(dto.getCountry());
        user.setCity(dto.getCity());
        userRepository.save(user);
        return user;
    }

    public List<VehicleResponseDto> findNearbyVehicle(String location) {
        List<VehicleResponseDto> vehicles = new ArrayList<>();
        vehicles = vehicleManager.findNearbyVehicle(location).getBody();
        return vehicles;
    }

    public Boolean rentCar(RentCarRequestDto dto) {
       // vehicleManager.rentCar(dto.getUsername(), dto.getCarId()); // rent car methodu aracın durmunu değiştirecek
        return true;
    }


}
