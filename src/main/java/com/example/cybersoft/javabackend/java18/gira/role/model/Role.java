package com.example.cybersoft.javabackend.java18.gira.role.model;

import com.example.cybersoft.javabackend.java18.gira.common.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = RoleEntity.Role.TABLE_NAME)
public class Role extends BaseEntity { // Panacech
    @Column(name = RoleEntity.Role.TABLE_NAME)
    private String name;

    @Column(name = RoleEntity.Role.CODE)
    private String code;

    @Column(name = RoleEntity.Role.DESCRIPTION)
    private String description;
}
