package codeday;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProjectsRepository extends CrudRepository<Projects, Integer> {
	
	List<Projects> findByName(String name);
	
	Projects findById(int id);

}
