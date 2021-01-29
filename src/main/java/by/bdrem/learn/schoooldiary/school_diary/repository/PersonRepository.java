package by.bdrem.learn.schoooldiary.school_diary.repository;

import by.bdrem.learn.schoooldiary.school_diary.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
