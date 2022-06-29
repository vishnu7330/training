package com.training.authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.training.authentication.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	@Query("SELECT r FROM Role r WHERE r.name = :name")
	public Role getRoleByRolename(@Param("name") String name);
}
