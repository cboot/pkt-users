package com.poketroll.users.utils.mappers;

import com.poketroll.users.api.model.CreateUserRequest;
import com.poketroll.users.domain.usecases.model.CreateUserInput;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CreateUserInputMapper extends Mapper<CreateUserRequest, CreateUserInput> {

}
