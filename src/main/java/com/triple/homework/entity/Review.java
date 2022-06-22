package com.triple.homework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {

  @Id
  private String id;

  private String content;

  @OneToMany
  private User user;
}
