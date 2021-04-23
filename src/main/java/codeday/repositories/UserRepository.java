package codeday.repositories;

import org.springframework.data.repository.CrudRepository;

import codeday.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
