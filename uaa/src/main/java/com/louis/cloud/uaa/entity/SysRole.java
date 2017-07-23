package com.louis.cloud.uaa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
}