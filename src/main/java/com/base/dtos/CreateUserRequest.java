package com.base.dtos;


import jakarta.validation.constraints.NotBlank;

public record CreateUserRequest(@NotBlank String username,
                                @NotBlank String password,
                                CreateRoleRequest roleRequest) {
}
