package com.poketroll.users.utils.mappers;

import com.poketroll.users.api.model.CreateUserResponse;
import com.poketroll.users.domain.usecases.model.CreateUserOutput;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CreateUserResponseMapper extends Mapper<CreateUserOutput, CreateUserResponse> {
}
