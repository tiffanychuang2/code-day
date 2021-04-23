package codeday.controllers;

import java.sql.Timestamp;
import java.util.Date;

//import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

@Controller
public class TaskTrackerController {
	
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
	
//login
	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		return "login";
	}
	
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
	
//home
	@RequestMapping("/")
	public String defaultPage() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String getTrackerOptions(Model model) {
		model.addAttribute(model);
		return "index";
	}
	
//customer
	@RequestMapping("/customer")
	public String getAllCustomers(Model model) {
		model.addAttribute("customer", customerRepo.findAll());
		return "customer";
	}	
	
	@RequestMapping("/add-customer")
	public String addCustomer(@RequestParam int id, String name) {
		Customer newCustomer = customerRepo.findByName(name);
		if (newCustomer == null) {
			newCustomer = new Customer(name);
			customerRepo.save(newCustomer);
		}
		return "redirect:/customer";
	}
	
	@RequestMapping("/remove-customer")
	public String removeCustomer(@RequestParam int id) {
		customerRepo.deleteById(id);

		return "redirect:/customer";
	}
	
//project
	@RequestMapping("/project")
	public String getAllProjects(Model model) {
		model.addAttribute("project", projectRepo.findAll());
		return "project";
	}
	
	@RequestMapping("/add-project")
	public String addProject(@RequestParam int customerId, String name) {
		Project newProject = projectRepo.findByName(name);
		if (newProject == null) {
			newProject = new Project(customerId, name);
			projectRepo.save(newProject);
		}
		return "redirect:/project";
	}
	
	@RequestMapping("/remove-project")
	public String removeProject(@RequestParam int id) {
		projectRepo.deleteById(id);

		return "redirect:/project";
	}
	
//task
	@RequestMapping("/task")
	public String getAllTasks(Model model) {
		model.addAttribute("task", taskRepo.findAll());
		return "task";
	}
	
	@RequestMapping("/add-task")
	public String addTask(@RequestParam String description, int projectId) {
		Task newTask = taskRepo.findByDescription(description);
		if (newTask == null) {
			newTask = new Task(description, projectId);
			taskRepo.save(newTask);
		}
		return "redirect:/task";
	}
	
	@RequestMapping("/remove-task")
	public String removeTask(@RequestParam int id) {
		taskRepo.deleteById(id);

		return "redirect:/task";
	}
	
//taskLog
	@RequestMapping("/taskLog")
	public String getDurationMinutes(Model model) {
		model.addAttribute("taskLog", taskLogRepo.findAll());
		return "taskLog";
	}
	
	@RequestMapping("/add-tasklog")
	public String addTaskLog(@RequestParam int taskId, int userId, int durationMinutes, Timestamp startTime, Timestamp stopTime) {
		TaskLog newTaskLog = taskLogRepo.findByTaskId(taskId);
		if (newTaskLog == null) {
			newTaskLog = new TaskLog(taskId, userId, durationMinutes, startTime, stopTime);
			taskLogRepo.save(newTaskLog);
		}
		return "redirect:/taskLog";
	}
	
	@RequestMapping("/remove-tasklog")
	public String removeTaskLog(@RequestParam int id) {
		taskLogRepo.deleteById(id);

		return "redirect:/taskLog";
	}
	
	@RequestMapping("/start-task-time")
	public String startTaskTime(@RequestParam int id, Timestamp startTime) {
		Date date = new Date();
		TaskLog currentTask = taskLogRepo.findById(id);
		Timestamp currentTime=new Timestamp(date.getTime());
		currentTask.startTime = currentTime;
		taskLogRepo.save(currentTask);
		return "redirect:/taskLog";
	}

	@RequestMapping("/stop-task-time")
	public String stopTaskTime(@RequestParam int id) {
		Date date = new Date();
		TaskLog currentTask = taskLogRepo.findById(id);
		Timestamp currentTime=new Timestamp(date.getTime());
		currentTask.stopTime = currentTime;
		taskLogRepo.save(currentTask);
		return "redirect:/taskLog";
	}

}
