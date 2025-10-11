package vn.shop.business.service;

import vn.shop.business.entity.User;
import vn.shop.business.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() { return userRepository.findAll(); }
    public User getUser(Long id) { return userRepository.findById(id).orElse(null); }
    public User saveUser(User user) { return userRepository.save(user); }
    public void deleteUser(Long id) { userRepository.deleteById(id); }
    public void lockUser(Long id, boolean locked) {
        User user = getUser(id);
        if (user != null) {
            user.setLocked(locked);
            userRepository.save(user);
        }
    }
}