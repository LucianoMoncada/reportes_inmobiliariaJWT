package com.base.dtos;



import java.util.List;


public record CreateRoleRequest(
        List<String> roleListName) {
}
