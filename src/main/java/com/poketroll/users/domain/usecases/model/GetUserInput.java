package com.poketroll.users.domain.usecases.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetUserInput {

  private long id;
}
