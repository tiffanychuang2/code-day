package codeday;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import codeday.models.Customers;
import codeday.models.Projects;
import codeday.models.TaskLogs;
import codeday.models.Tasks;
import codeday.repositories.CustomersRepository;
import codeday.repositories.ProjectsRepository;
import codeday.repositories.TaskLogsRepository;
import codeday.repositories.TasksRepository;
import codeday.repositories.UsersRepository;

@Component
public class TaskTrackerPopulator implements CommandLineRunner {
	@Resource
	CustomersRepository customersRepo;
	
	@Resource
	ProjectsRepository projectsRepo;
	
	@Resource
	TaskLogsRepository taskLogsRepo;
	
	@Resource
	TasksRepository tasksRepo;
	
	@Resource
	UsersRepository usersRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Customers chandlerBing = new Customers("Chandler Bing");
		customersRepo.save(chandlerBing);
		Customers lavenderGooms = new Customers("Lavender Gooms");
		customersRepo.save(lavenderGooms);
		Customers barneyStinson = new Customers("Barney Stinson");
		customersRepo.save(barneyStinson);
		
		Projects seize = new Projects(2, "S.E.I.Z.E.");
		projectsRepo.save(seize);
		Projects please = new Projects(3, "P.L.E.A.S.E.");
		projectsRepo.save(please);
		Projects wenus = new Projects(1, "W.E.N.U.S.");
		projectsRepo.save(wenus);
		
		Tasks taskSeize = new Tasks("S is for seize.", 4);
		tasksRepo.save(taskSeize);
		Tasks taskEggs = new Tasks("E is for eggs.", 4);
		tasksRepo.save(taskEggs);
		Tasks taskIdk = new Tasks("I is for I don't know.", 4);
		tasksRepo.save(taskIdk);
		Tasks taskZebra = new Tasks("Z is for zebra.", 4);
		tasksRepo.save(taskZebra);
		Tasks taskEighties = new Tasks("E is for eighties.", 4);
		tasksRepo.save(taskEighties);
		Tasks taskPlease = new Tasks("Provide Legal Exculpation and Sign Everything.", 5);
		tasksRepo.save(taskPlease);
		Tasks taskWenus = new Tasks("Weekly Estimated Net Usage Statistics.", 6);
		tasksRepo.save(taskWenus);
		
		TaskLogs one = new TaskLogs(7, 18, 30);
		taskLogsRepo.save(one);
		TaskLogs two = new TaskLogs(8, 19, 45);
		taskLogsRepo.save(two);
		TaskLogs three = new TaskLogs(12, 20, 65);
		taskLogsRepo.save(three);
		TaskLogs four = new TaskLogs(13, 21, 80);
		taskLogsRepo.save(four);
		
		
		
	}

}
