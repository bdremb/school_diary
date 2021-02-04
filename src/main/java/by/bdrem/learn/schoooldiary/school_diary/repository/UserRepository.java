package by.bdrem.learn.schoooldiary.school_diary.repository;

import by.bdrem.learn.schoooldiary.school_diary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
