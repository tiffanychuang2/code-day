package codeday.controllers;

//import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import codeday.models.Customer;
import codeday.repositories.CustomerRepository;
import codeday.repositories.ProjectRepository;
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
	
	@RequestMapping("/login.html")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		return "login";
	}
	
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
	
	@RequestMapping("/")
	public String defaultPage() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String getTrackerOptions(Model model) {
		model.addAttribute(model);
		return "index";
	}
	
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
	
//		Optional<Customers> customerResult = customerRepo.findById(customerId);
//		Customers customer = customerResult.get();

//			Optional<Projects> customerProject = projectsRepo.findByCustomer(customer);

//		if (customerResult.isPresent()) {
			customerRepo.deleteById(id);
//		}
		
//		return "redirect:/customer";
//	}
	
//		Customer customerResult = customerRepo.findById(id);
//		customerRepo.delete(customerResult);
	
	return "redirect:/customer";
	}
	
	@RequestMapping("/project")
	public String getAllProjects(Model model) {
		model.addAttribute("project", projectRepo.findAll());
		return "project";
	}
	
	@RequestMapping("/task")
	public String getAllTasks(Model model) {
		model.addAttribute("task", taskRepo.findAll());
		return "task";
	}
	
	@RequestMapping("/taskLog")
	public String getDurationMinutes(Model model) {
		model.addAttribute("taskLog", taskLogRepo.findAll());
		return "taskLog";
	}

}
