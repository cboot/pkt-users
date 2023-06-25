package com.poketroll.users.utils.mappers;

import com.poketroll.users.api.model.GetUserResponse;
import com.poketroll.users.domain.usecases.model.GetUserOutput;

@org.mapstruct.Mapper(componentModel = "spring")
public interface GetUserResponseMapper extends Mapper<GetUserOutput, GetUserResponse> {}
