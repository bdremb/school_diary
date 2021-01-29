package by.bdrem.learn.schoooldiary.school_diary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/test")
  public String test() {
    return "test";
  }

}
