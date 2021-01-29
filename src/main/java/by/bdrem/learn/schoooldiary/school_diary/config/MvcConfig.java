package by.bdrem.learn.schoooldiary.school_diary.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("/").setViewName("index");
    registry.addViewController("/teacher_info").setViewName("teacher");
    registry.addViewController("/parent_info").setViewName("parent");
  }
}
