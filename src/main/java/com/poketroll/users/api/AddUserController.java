package com.poketroll.users.api;

import com.poketroll.users.api.model.CreateUserRequest;
import com.poketroll.users.api.model.CreateUserResponse;
import com.poketroll.users.domain.usecases.CreateUserUseCase;
import com.poketroll.users.domain.usecases.model.CreateUserInput;
import com.poketroll.users.domain.usecases.model.CreateUserOutput;
import com.poketroll.users.utils.mappers.Mapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.poketroll.users.config.ApiConstants.V1;

@RestController
@RequestMapping(V1 + "users")
@RequiredArgsConstructor
public class AddUserController {

  private final CreateUserUseCase useCase;
  private final Mapper<CreateUserRequest, CreateUserInput> inputMapper;
  private final Mapper<CreateUserOutput, CreateUserResponse> outputMapper;

  @PostMapping
  public ResponseEntity<CreateUserResponse> execute(@Valid @RequestBody CreateUserRequest request) {

    CreateUserInput input = inputMapper.map(request);
    CreateUserOutput output = useCase.execute(input);
    CreateUserResponse response = outputMapper.map(output);
    return ResponseEntity.ok(response);
  }
}
