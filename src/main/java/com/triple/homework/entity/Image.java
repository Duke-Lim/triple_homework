package com.triple.homework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Image {

  @Id
  private String id;

  private String name;
  private String location;
  private Integer size;

  @OneToMany
  private Review review;
}
