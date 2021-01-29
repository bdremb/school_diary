package by.bdrem.learn.schoooldiary.school_diary.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

import static by.bdrem.learn.schoooldiary.school_diary.role.Role.PARENT;
import static by.bdrem.learn.schoooldiary.school_diary.role.Role.SCHOOLBOY;
import static by.bdrem.learn.schoooldiary.school_diary.role.Role.TEACHER;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  private final DataSource dataSource;

  @Autowired
  public SecurityConfiguration(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication().dataSource(dataSource);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers("/parent_info").hasRole(PARENT.get())
        .antMatchers("/schoolboy_info").hasAnyRole(SCHOOLBOY.get(), PARENT.get())
        .antMatchers("/teacher_info").hasRole(TEACHER.get())
        .and()
        .formLogin()
        .permitAll()
        .and()
        .logout()
        .permitAll();
  }
}
