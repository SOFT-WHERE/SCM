package com.scm.entities;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String number;
    private String socialLink;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy="contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ArrayList<SocialLink> links=new ArrayList<>();
}
