package vn.shop.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.shop.business.entity.User;
import vn.shop.business.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", produces = { "application/json" }, method = RequestMethod.GET)
	private ResponseEntity<List<User>> requestUsers() {
		List<User> user = userService.getAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/register", produces = { "application/json" }, method = RequestMethod.POST)
	private void registerUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@RequestMapping(value = "/update/{id}", produces = { "application/json" }, method = RequestMethod.PUT)
    public void updateProduct(@PathVariable Long id, @RequestBody User user) {
        User u = userService.getUser(id);
        u = u.toBuilder().username(null).password(null).role(null).build();
        userService.saveUser(u);
    }
    
    @RequestMapping(value = "/delete/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable Long id) {
    	User u = userService.getUser(id);
        u = u.toBuilder().locked(false).build();
        userService.saveUser(u);
    }
}