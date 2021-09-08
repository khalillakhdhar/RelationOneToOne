package com.http.tp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotNull
@Size(max=65)
private String firstName;
@NotNull
@Size(max=65)
private String lastName;
@NotNull
@Email
@Size(max=100)
@Column(unique = true)
private String email;
@NotNull
@Size(max = 128)
private String password;



}
