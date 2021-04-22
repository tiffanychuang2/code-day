package codeday;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class TaskTrackerPopulator {
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
	
	public void run(String... args) throws Exception {
		
		Customers chandlerBing = new Customers(1, "Chandler Bing");
		customersRepo.save(chandlerBing);
		Customers lavenderGooms = new Customers(2, "Lavender Gooms");
		customersRepo.save(lavenderGooms);
		Customers barneyStinson = new Customers(2, "Barney Stinson");
		customersRepo.save(barneyStinson);
		
		Projects seize = new Projects(1, 2, "S.E.I.Z.E.");
		projectsRepo.save(seize);
		Projects please = new Projects(2, 3, "P.L.E.A.S.E.");
		projectsRepo.save(please);
		Projects wenus = new Projects(3, 1, "WENUS");
		projectsRepo.save(wenus);
		
		Tasks taskSeize = new Tasks(1, "S is for seize.", 1);
		tasksRepo.save(taskSeize);
		Tasks taskEggs = new Tasks(2, "E is for eggs.", 1);
		tasksRepo.save(taskEggs);
		Tasks taskIdk = new Tasks(3, "I is for I don't know.", 1);
		tasksRepo.save(taskIdk);
		Tasks taskZebra = new Tasks(4, "Z is for zebra.", 1);
		tasksRepo.save(taskZebra);
		Tasks taskEighties = new Tasks(5, "E is for eighties.", 1);
		tasksRepo.save(taskEighties);
		Tasks taskPlease = new Tasks(6, "Provide Legal Exculpation and Sign Everything.", 2);
		tasksRepo.save(taskPlease);
		Tasks taskWenus = new Tasks(7, "Weekly Estimated Net Usage Statistics.", 3);
		tasksRepo.save(taskWenus);
		
		
	}

}
