package by.bdrem.learn.schoooldiary.school_diary.service;

import by.bdrem.learn.schoooldiary.school_diary.model.Person;

import java.util.List;

public interface PersonService {

  List<Person> getAllPersons();

  Person savePerson(Person person);

  Person getPerson(int id);

  void deletePerson(int id);
}
