package by.bdrem.learn.schoooldiary.school_diary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {

  @Id
  @Column(name = "username", nullable = false)
  private String name;

  @Column(name = "reg_time")
  private LocalDateTime time;

  @Column(name = "enabled")
  private boolean enabled;
}
