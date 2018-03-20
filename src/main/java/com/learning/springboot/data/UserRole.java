package com.learning.springboot.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_Id")
    private long roleId;

    @NotNull
    @Column(name="description")
    private String description;


    @NotNull
    @Column(name="group_name")
    private String groupName;



}
