package com.poketroll.users.api.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateUserRequest {

    private String name;
}
