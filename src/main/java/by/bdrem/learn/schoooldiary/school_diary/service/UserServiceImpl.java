package by.bdrem.learn.schoooldiary.school_diary.service;

import by.bdrem.learn.schoooldiary.school_diary.model.User;
import by.bdrem.learn.schoooldiary.school_diary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> getAllUsers() {
    return null;
  }

  @Override
  public User saveUser(User user) {
    return null;
  }

  @Override
  public User getUser(int id) {
    return null;
  }

  @Override
  public void deleteUser(int id) {

  }
}
