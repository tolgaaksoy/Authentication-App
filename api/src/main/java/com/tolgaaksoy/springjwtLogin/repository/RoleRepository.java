package com.tolgaaksoy.springjwtLogin.repository;

import java.util.Optional;

import com.tolgaaksoy.springjwtLogin.models.ERole;
import com.tolgaaksoy.springjwtLogin.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
