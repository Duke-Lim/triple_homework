package com.triple.homework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

  @Id
  private String id;

  private String email;
  private String password;
  private String name;
}
