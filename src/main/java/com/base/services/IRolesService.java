package com.base.services;

import com.base.dtos.RoleDTO;
import com.base.entities.RoleEntity;

import java.util.List;

public interface IRolesService {
    List<RoleEntity> getAll();
    RoleEntity getById(Long id);
    RoleEntity save(RoleDTO rol);
    RoleEntity update(Long id, RoleDTO rol);
}
