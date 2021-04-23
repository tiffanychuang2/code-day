package codeday.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import codeday.models.SecureUser;

public interface SecureUserRepository extends CrudRepository<SecureUser, Integer> {

	Optional<SecureUser> findByUsername(String username);

}
