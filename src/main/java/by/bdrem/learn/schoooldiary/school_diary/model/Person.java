package by.bdrem.learn.schoooldiary.school_diary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "persons")
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "number_class")
  private int numberClass;

  @Column(name = "reg_time")
  private LocalDateTime time;

  public Role getRole() {
    return numberClass == 0 ? Role.MODERATOR : Role.USER;
  }
}
