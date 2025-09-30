package com.mllq.back.core.domain.core.repo.role_user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mllq.back.core.domain.core.entities.RoleUser;
import com.mllq.back.core.domain.core.entities.User;

public interface RoleUserRepository extends JpaRepository<RoleUser, Long>{
    List<RoleUser> findAllByUserAndIsDeletedFalse(User user);
}
