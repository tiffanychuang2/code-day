package codeday;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskTrackerController {
	
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
	
	@RequestMapping("/home")
	public String getAllTasks(Model model) {
		model.addAttribute(model);
		return "home";
	}

}
