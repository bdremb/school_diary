package by.bdrem.learn.schoooldiary.school_diary.repository;

import by.bdrem.learn.schoooldiary.school_diary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
