package codeday.repositories;

import org.springframework.data.repository.CrudRepository;

import codeday.models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
