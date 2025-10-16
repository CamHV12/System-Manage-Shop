package vn.shop.business.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.shop.business.domain.user.LoginRequest;
import vn.shop.business.domain.user.LoginRespone;
import vn.shop.business.entity.User;
import vn.shop.business.service.impl.UserServiceImpl;

// @CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

	// Inject UserService để thao tác với dữ liệu user
    private final UserServiceImpl userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
		User user = userService.getUserAndRoleByUsername(loginRequest.getUsername());
		// 5. Trả về response chứa token và thông tin người dùng
        return ResponseEntity.ok(new LoginRespone(user.getUsername(), user.getRole()));
	}
}