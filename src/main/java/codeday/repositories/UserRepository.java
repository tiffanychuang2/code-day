package codeday.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import codeday.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findById(int id);
	
	List<User> findAll();

}
