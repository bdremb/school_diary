package by.bdrem.learn.schoooldiary.school_diary.service;

import by.bdrem.learn.schoooldiary.school_diary.model.User;
import by.bdrem.learn.schoooldiary.school_diary.repository.UserRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> list() {
    ArrayList<User> users = new ArrayList<>();
    Iterable<User> postIterable = userRepository.findAll();
    for (User user : postIterable) {
      users.add(user);
    }
    User test = new User();
    test.setName("Test");
    users.add(test);
    return users;
  }
}
