package codeday;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
//	@RequestMapping("/login.html")
//	public String login(@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout) {
//		return "login";
//	}
	
//	@RequestMapping("/login-error")
//	public String loginError(Model model) {
//		model.addAttribute("loginError", true);
//		return "login";
//	}
	
	@RequestMapping("/")
	public String defaultPage() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String getTrackerOptions(Model model) {
		model.addAttribute(model);
		return "index";
	}
	
	@RequestMapping("/customers.html")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", customersRepo.findAll());
		return "customers";
	}
	
	// add a genre to a review and have it show on genres.html as well
		@RequestMapping("/add-customer")
		// public String addGenre(@RequestParam(value = "id") Long id, String genreName,
		// String genre, String genreImage) {
		public String addCustomer(@RequestParam int id, String name) {
			Customers newCustomer = customersRepo.findByName(name);
			if (newCustomer == null) {
				// newGenre = new Genre(genreName, genre, genreImage);
				newCustomer = new Customers(id, name);
				customersRepo.save(newCustomer);
			}
//			MovieReview review = reviewRepo.findOne(id);
//			Set<Genre> existingGenres = review.getMovieGenres();
//			if (!existingGenres.contains(newGenre)) {
//				review.addGenre(newGenre);
//				reviewRepo.save(review);
//			}
			return "redirect:/customers?id=" + id;
		}

		// remove genre from review.html only
//		@RequestMapping("/remove-genre")
//		public String removeGenre(@RequestParam Long genreId, @RequestParam Long reviewId) {
//			Genre deleteGenre = genreRepo.findOne(genreId);
//			MovieReview review = reviewRepo.findOne(reviewId);
//
//			Set<Genre> existingGenres = review.getMovieGenres();
//
//			if (existingGenres.contains(deleteGenre)) {
//				review.removeGenre(deleteGenre);
//				reviewRepo.save(review);
//			}
//			return "redirect:/review?id=" + reviewId;
//		}
	
	@RequestMapping("/projects.html")
	public String getAllProjects(Model model) {
		model.addAttribute("projects", projectsRepo.findAll());
		return "projects";
	}
	
	@RequestMapping("/tasks.html")
	public String getAllTasks(Model model) {
		model.addAttribute("tasks", tasksRepo.findAll());
		return "tasks";
	}
	
	@RequestMapping("/taskLogs.html")
	public String getDurationMinutes(Model model) {
		model.addAttribute("taskLogs", taskLogsRepo.findAll());
		return "taskLogs";
	}

}
