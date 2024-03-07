package com.CK.controller;

import com.CK.dto.request.CreateUserRequestDto;
import com.CK.dto.request.UpdateRequestDto;
import com.CK.entity.UserProfile;
import com.CK.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.CK.constant.RestApiUrls.*;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
        return ResponseEntity.ok(userService.createUser(dto));
    }

    @PostMapping(UPDATE_USER)
    public ResponseEntity<UserProfile> updateUser(@RequestBody UpdateRequestDto dto){
        return ResponseEntity.ok(userService.updateUser(dto));
    }

//    @PostMapping(RENT_CAR)
//    public ResponseEntity<Boolean> rentCar(RentCarRequestDto dto){
//        return ResponseEntity.ok(userService.rentCar(dto));
//    }
}
