package com.greenfoxacademy.smallproject.models;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;

    public Role(){

    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleid) {
        this.roleId = roleid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

