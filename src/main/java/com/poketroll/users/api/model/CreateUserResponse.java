package com.poketroll.users.api.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateUserResponse {

  private long id;

  private String name;

  private String email;
}
