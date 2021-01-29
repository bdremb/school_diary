package by.bdrem.learn.schoooldiary.school_diary.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

import static by.bdrem.learn.schoooldiary.school_diary.role.UserRole.PARENT;
import static by.bdrem.learn.schoooldiary.school_diary.role.UserRole.SCHOOLBOY;
import static by.bdrem.learn.schoooldiary.school_diary.role.UserRole.TEACHER;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
  @Autowired
  DataSource dataSource;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication().dataSource(dataSource);

  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/", "/login").hasAnyRole(SCHOOLBOY.getRole(), PARENT.getRole(), TEACHER.getRole())
        .antMatchers("/parent_info").hasAnyRole(PARENT.getRole())
        .antMatchers("/**").hasAnyRole(TEACHER.getRole())
        .and()
        .formLogin()
        .permitAll();
  }
}
