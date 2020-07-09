package com.lyes.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lyes.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{

}
