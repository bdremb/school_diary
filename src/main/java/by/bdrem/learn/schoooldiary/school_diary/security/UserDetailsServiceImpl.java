package by.bdrem.learn.schoooldiary.school_diary.security;

import by.bdrem.learn.schoooldiary.school_diary.model.Person;
import by.bdrem.learn.schoooldiary.school_diary.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("UserDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

  private final PersonRepository personRepository;

  @Autowired
  public UserDetailsServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Person person = personRepository.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("user " + email
            + " not found"));
    return SecurityUser.fromPerson(person);
  }
}
