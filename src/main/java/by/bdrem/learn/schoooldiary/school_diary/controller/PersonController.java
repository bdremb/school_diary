package by.bdrem.learn.schoooldiary.school_diary.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

  @GetMapping("/users")
  @PreAuthorize("hasAuthority('user:write')")
  public String user() {
    return "parent";
  }

  @GetMapping("/moderator")
  @PreAuthorize("hasAuthority('user:moderate')")
  public String moderator() {
    return "teacher";
  }

}
