package group.Java.repository;

import group.Java.User;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

public interface UserRepository extends CrudRepository<User,Integer> {
    }

