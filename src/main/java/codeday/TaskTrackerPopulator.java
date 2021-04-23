package codeday;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import codeday.models.Customer;
import codeday.models.Project;
import codeday.models.Task;
import codeday.models.TaskLog;
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
		
		Customer chandlerBing = new Customer("Chandler Bing");
		customerRepo.save(chandlerBing);
		Customer lavenderGooms = new Customer("Lavender Gooms");
		customerRepo.save(lavenderGooms);
		Customer barneyStinson = new Customer("Barney Stinson");
		customerRepo.save(barneyStinson);
		
		Project seize = new Project(2, "S.E.I.Z.E.");
		projectRepo.save(seize);
		Project please = new Project(3, "P.L.E.A.S.E.");
		projectRepo.save(please);
		Project wenus = new Project(1, "W.E.N.U.S.");
		projectRepo.save(wenus);
		
		Task taskSeize = new Task("S is for seize.", 4);
		taskRepo.save(taskSeize);
		Task taskEggs = new Task("E is for eggs.", 4);
		taskRepo.save(taskEggs);
		Task taskIdk = new Task("I is for I don't know.", 4);
		taskRepo.save(taskIdk);
		Task taskZebra = new Task("Z is for zebra.", 4);
		taskRepo.save(taskZebra);
		Task taskEighties = new Task("E is for eighties.", 4);
		taskRepo.save(taskEighties);
		Task taskPlease = new Task("Provide Legal Exculpation and Sign Everything.", 5);
		taskRepo.save(taskPlease);
		Task taskWenus = new Task("Weekly Estimated Net Usage Statistics.", 6);
		taskRepo.save(taskWenus);
		
		TaskLog one = new TaskLog(7, 18, 30);
		taskLogRepo.save(one);
		TaskLog two = new TaskLog(8, 19, 45);
		taskLogRepo.save(two);
		TaskLog three = new TaskLog(12, 20, 65);
		taskLogRepo.save(three);
		TaskLog four = new TaskLog(13, 21, 80);
		taskLogRepo.save(four);
		
		
		
	}

}
