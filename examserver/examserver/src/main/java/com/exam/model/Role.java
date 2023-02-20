package com.exam.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private Long rollId;
    private String rollName;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "role",cascade = CascadeType.ALL)
    private Set<UserRole> userRoles = new HashSet<>();

    public Role(Long rollId) {
        this.rollId = rollId;
    }

    public Long getRollId() {
        return rollId;
    }

    public void setRollId(Long rollId) {
        this.rollId = rollId;
    }

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
