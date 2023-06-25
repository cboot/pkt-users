package com.poketroll.users.domain.usecases;

import com.poketroll.users.domain.entities.User;
import com.poketroll.users.domain.exceptions.AlreadyExistsException;
import com.poketroll.users.domain.repostories.UserRepository;
import com.poketroll.users.domain.usecases.model.CreateUserInput;
import com.poketroll.users.domain.usecases.model.CreateUserOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {

  private final UserRepository userRepository;

  public CreateUserOutput execute(CreateUserInput input) {

    userRepository
        .findByEmail(input.getEmail())
        .ifPresent(
            user -> {
              throw new AlreadyExistsException(
                  String.format("User with email %s already exists", input.getEmail()));
            });

    User user = User.builder().name(input.getName()).email(input.getEmail()).build();

    userRepository.save(user);
    return CreateUserOutput.builder()
        .id(user.getId())
        .name(user.getName())
        .email(input.getEmail())
        .build();
  }
}
