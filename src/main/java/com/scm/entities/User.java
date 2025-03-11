package com.scm.entities;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    // @Column(length = 10000)
    private String about;
    // @Column(length = 10000)
    private String profilePic;
    private String phoneNumber;
    private boolean enabled=false;
    private boolean emailVerified=false;
    private boolean phoneVerified=false;

    private Providers provider=Providers.SELF;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArrayList<Contact> contacts=new ArrayList<>();

}
