package com.CK.mapper;

import com.CK.dto.request.RegisterRequestDto;
import com.CK.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {

    AuthMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(AuthMapper.class);

    Auth fromReqisterRequestDtoToAuth(RegisterRequestDto dto);
}
