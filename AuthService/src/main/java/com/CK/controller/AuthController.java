package com.CK.controller;

import com.CK.dto.request.LoginRequestDto;
import com.CK.dto.request.RegisterRequestDto;
import com.CK.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.CK.constant.RestApiUrls.*;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(REGISTER)
    public ResponseEntity<Boolean> register(RegisterRequestDto dto) {
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping(LOGIN)
    public ResponseEntity<Boolean> login(LoginRequestDto dto) {
        return ResponseEntity.ok(authService.login(dto));
    }
}
