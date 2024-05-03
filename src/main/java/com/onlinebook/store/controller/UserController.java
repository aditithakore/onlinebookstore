package com.onlinebook.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.onlinebook.store.entity.Users;
import com.onlinebook.store.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        List<Users> user = userService.findByUsername(username);
        if (!user.isEmpty() && user.get(0).getPassword().equals(password)) {
            // Login successful, add user to the model or perform other actions
            model.addAttribute("user", user);
            return "success";
        } else {
            // Login failed, add error message to the model
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    @GetMapping("/signup")
    public String signup(@RequestParam("username") String username,
                         @RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName,
                         Model model) {
        Users user = new Users();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        Users savedUser = userService.saveUser(user);
        if (savedUser != null) {
            // Signup successful, add user to the model or perform other actions
            model.addAttribute("user", savedUser);
            return "signupSuccess";
        } else {
            // Signup failed, add error message to the model
            model.addAttribute("error", "Failed to sign up");
            return "signup";
        }
    }
}
