package codeday;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import codeday.models.Customer;
import codeday.models.Project;
import codeday.models.Task;
import codeday.models.TaskLog;
import codeday.models.User;
import codeday.repositories.CustomerRepository;
import codeday.repositories.ProjectRepository;
import codeday.repositories.SecureUserRepository;
import codeday.repositories.TaskLogRepository;
import codeday.repositories.TaskRepository;
import codeday.repositories.UserRepository;

@Component
public class TaskTrackerPopulator implements CommandLineRunner {
	@Resource
	CustomerRepository customerRepo;
	
	@Resource
	ProjectRepository projectRepo;
	
	@Resource
	TaskLogRepository taskLogRepo;
	
	@Resource
	TaskRepository taskRepo;
	
	@Resource
	UserRepository userRepo;
	
	@Resource
	SecureUserRepository secureUserRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User("user", "password");
		userRepo.save(user);
		
		Customer chanandlerBong = new Customer("Chandler Bing");
		customerRepo.save(chanandlerBong);
		Customer lavenderGooms = new Customer("Lavender Gooms");
		customerRepo.save(lavenderGooms);
		Customer barneyStinson = new Customer("Barney Stinson");
		customerRepo.save(barneyStinson);
		
		Project seize = new Project(lavenderGooms, "S.E.I.Z.E.");
		projectRepo.save(seize);
		Project please = new Project(barneyStinson, "P.L.E.A.S.E.");
		projectRepo.save(please);
		Project wenus = new Project(chanandlerBong, "W.E.N.U.S.");
		projectRepo.save(wenus);
		
		Task taskSeize = new Task("S is for seize.", seize);
		taskRepo.save(taskSeize);
		Task taskEggs = new Task("E is for eggs.", seize);
		taskRepo.save(taskEggs);
		Task taskIdk = new Task("I is for I don't know.", seize);
		taskRepo.save(taskIdk);
		Task taskZebra = new Task("Z is for zebra.",seize);
		taskRepo.save(taskZebra);
		Task taskEighties = new Task("E is for eighties.", seize);
		taskRepo.save(taskEighties);
		Task taskPlease = new Task("Provide Legal Exculpation and Sign Everything.", please);
		taskRepo.save(taskPlease);
		Task taskWenus = new Task("Weekly Estimated Net Usage Statistics.", wenus);
		taskRepo.save(taskWenus);
		
		TaskLog one = new TaskLog(taskSeize, user, 30, null, null);
		taskLogRepo.save(one);
		TaskLog two = new TaskLog(taskZebra, user, 45, null, null);
		taskLogRepo.save(two);
		TaskLog three = new TaskLog(taskWenus, user, 65, null, null);
		taskLogRepo.save(three);
		TaskLog four = new TaskLog(taskPlease, user, 80, null, null);
		taskLogRepo.save(four);
		
		
		
	}

}
