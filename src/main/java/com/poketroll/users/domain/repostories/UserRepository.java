package com.poketroll.users.domain.repostories;

import com.poketroll.users.domain.entities.User;
import java.util.Optional;

public interface UserRepository {

  User save(User user);

  Optional<User> findById(Long id);

  Optional<User> findByEmail(String email);
}
