package com.triple.homework.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
@SequenceGenerator(
  name = "POINT_SEQ_GENERATOR",
  sequenceName = "POINT_SEQ",
  initialValue = 1,
  allocationSize = 1
)
public class Point {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "POINT_SEQ_GENERATOR"
  )
  private Long seq;

  private Integer value;

  @OneToMany
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany
  @JoinColumn(name = "review_id")
  private Review review;
}
