package by.bdrem.learn.schoooldiary.school_diary.controller;

import by.bdrem.learn.schoooldiary.school_diary.model.User;
import by.bdrem.learn.schoooldiary.school_diary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultController {

  private final UserService userService;

  @Autowired
  public DefaultController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public ResponseEntity<List<User>> list() {
    return ResponseEntity.ok(userService.list());
  }

}
