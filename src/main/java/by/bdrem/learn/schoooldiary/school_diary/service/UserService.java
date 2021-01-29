package by.bdrem.learn.schoooldiary.school_diary.service;

import by.bdrem.learn.schoooldiary.school_diary.model.User;

import java.util.List;

public interface UserService {

  List<User> getAllUsers();

  User saveUser(User user);

  User getUser(int id);

  void deleteUser(int id);
}
