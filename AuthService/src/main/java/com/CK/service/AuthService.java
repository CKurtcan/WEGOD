package com.CK.service;

import com.CK.dto.request.LoginRequestDto;
import com.CK.dto.request.RegisterRequestDto;
import com.CK.entity.Auth;
import com.CK.exception.AuthManagerException;
import com.CK.exception.ErrorType;
import com.CK.mapper.AuthMapper;
import com.CK.repository.AuthRepository;
import com.CK.utility.enums.Nationality;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;
    private final AuthMapper authMapper;
    public Boolean register(RegisterRequestDto dto) {
        if (dto.getNationality().equals(Nationality.TURKISH) && dto.getIdNum().length() != 11) {
            throw new AuthManagerException(ErrorType.BAD_REQUEST);
        }else if (dto.getNationality().equals(Nationality.OTHER) && dto.getIdNum().length() != 7) {
            throw new AuthManagerException(ErrorType.BAD_REQUEST);
        }
//        if (authRepository.existsByUsername(dto.getUsername())) {
//            throw new AuthManagerException(ErrorType.USERNAME_DUPLICATE);
//        }
        if (!dto.getPassword().equals(dto.getPasswordConfirm())) {
            throw new AuthManagerException(ErrorType.PASSWORDS_DO_NOT_MATCH);
        }
        Auth auth = authMapper.fromReqisterRequestDtoToAuth(dto);
        authRepository.save(auth);
        return true;
    }

    public Boolean login(LoginRequestDto dto) {
        if (!authRepository.existsByUsername(dto.getUsername())) {
            throw new AuthManagerException(ErrorType.USER_NOT_FOUND);
        }
        if (!authRepository.existsByPassword(dto.getPassword())) {
            throw new AuthManagerException(ErrorType.PASSWORD_INCORRECT);
        }
        return true;
    }
}
