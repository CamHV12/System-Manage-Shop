package vn.shop.business.controller;

import vn.shop.business.entity.User;
import vn.shop.business.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", produces = { "application/json" }, method = RequestMethod.GET)
	private ResponseEntity<List<User>> requestUsers() {
		List<User> user = userService.getAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping
	public String listAllUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "user/list";
	}

	@GetMapping("/add")
	public String addUserForm(Model model) {
		model.addAttribute("user", new User());
		return "user/add";
	}

	@PostMapping("/add")
	public String addUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}

	@GetMapping("/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUser(id));
		return "user/edit";
	}

	@PostMapping("/edit")
	public String editUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return "redirect:/users";
	}

	@GetMapping("/lock/{id}")
	public String lockUser(@PathVariable Long id) {
		userService.lockUser(id, true);
		return "redirect:/users";
	}

	@GetMapping("/unlock/{id}")
	public String unlockUser(@PathVariable Long id) {
		userService.lockUser(id, false);
		return "redirect:/users";
	}
}