package io.yadnyesh.cardatabase.repository;

import io.yadnyesh.cardatabase.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByUserName(String userName);
}
