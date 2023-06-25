package com.poketroll.users.domain.usecases;

import com.poketroll.users.domain.entities.User;
import com.poketroll.users.domain.exceptions.NotFoundException;
import com.poketroll.users.domain.repostories.UserRepository;
import com.poketroll.users.domain.usecases.model.GetUserInput;
import com.poketroll.users.domain.usecases.model.GetUserOutput;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserUseCase {

  private final UserRepository userRepository;

  public GetUserOutput execute(GetUserInput input) {

    Optional<User> user = userRepository.findById(input.getId());

    if (user.isEmpty()) {
      throw new NotFoundException(String.format("User with id %s not found", input.getId()));
    }

    User actualUser = user.get();
    return GetUserOutput.builder()
        .id(actualUser.getId())
        .name(actualUser.getName())
        .email(actualUser.getEmail())
        .build();
  }
}
