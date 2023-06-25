package com.poketroll.users.api.controllers;

import static com.poketroll.users.config.ApiConstants.V1;

import com.poketroll.users.api.model.GetUserResponse;
import com.poketroll.users.domain.usecases.GetUserUseCase;
import com.poketroll.users.domain.usecases.model.GetUserInput;
import com.poketroll.users.domain.usecases.model.GetUserOutput;
import com.poketroll.users.utils.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(V1 + "users")
@RequiredArgsConstructor
public class GetUserController {

  private final GetUserUseCase useCase;
  private final Mapper<GetUserOutput, GetUserResponse> outputMapper;

  @GetMapping("/{userId}")
  public ResponseEntity<GetUserResponse> execute(@PathVariable("userId") long userId) {

    GetUserInput input = GetUserInput.builder().id(userId).build();
    GetUserOutput output = useCase.execute(input);
    GetUserResponse response = outputMapper.map(output);
    return ResponseEntity.ok(response);
  }
}
