package com.poketroll.users.domain.usecases.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetUserOutput {

  private long id;
  private String name;
  private String email;
}
