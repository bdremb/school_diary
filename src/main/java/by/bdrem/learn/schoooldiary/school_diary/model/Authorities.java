package by.bdrem.learn.schoooldiary.school_diary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "authorities")
public class Authorities {

  @Id
  @Column(name = "username")
  private String username;

  @Column(name = "authority",
      columnDefinition = "enum('SCHOOLBOY', 'PARENT', 'TEACHER')", nullable = false)
  @Enumerated(value = EnumType.STRING)
  private Role authority;
}
