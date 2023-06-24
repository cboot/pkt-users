package com.poketroll.users.domain.usecases;

import com.poketroll.users.domain.usecases.model.CreateUserInput;
import com.poketroll.users.domain.usecases.model.CreateUserOutput;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {

  public CreateUserOutput execute(CreateUserInput input) {
    return CreateUserOutput.builder().build();
  }
}
