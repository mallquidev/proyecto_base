package com.mllq.back.core.domain.core.repo.role;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mllq.back.core.commons.models.enums.RoleEnum;
import com.mllq.back.core.domain.core.entities.Role;


@Repository// Indica a Spring que esta interfaz es un componente de acceso a datos
public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Optional<Role> findByName(RoleEnum name);
    boolean existsByName(Role name);
}
