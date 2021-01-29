package by.bdrem.learn.schoooldiary.school_diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SchoolDiaryApplication {

  public static void main(String[] args) {
    SpringApplication.run(SchoolDiaryApplication.class, args);
  }
}
