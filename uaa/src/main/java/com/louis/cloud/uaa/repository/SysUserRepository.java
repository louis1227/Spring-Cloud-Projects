package com.louis.cloud.uaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louis.cloud.uaa.entity.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}