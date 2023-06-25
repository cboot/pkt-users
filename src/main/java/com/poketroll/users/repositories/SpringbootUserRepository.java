package com.poketroll.users.repositories;

import com.poketroll.users.domain.entities.User;
import com.poketroll.users.domain.repostories.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringbootUserRepository extends JpaRepository<User, Long>, UserRepository {}
