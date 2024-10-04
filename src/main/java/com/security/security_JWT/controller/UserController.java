package com.security.security_JWT.controller;

import com.security.security_JWT.Entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<User> users = new ArrayList<>();

    @GetMapping("/hello")
    public String showMessage(HttpServletRequest request) {
        return "Hello Ashish " + request.getSession().getId();
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        users.add(new User(1, "Ashish", "a@123"));
        users.add(new User(2, "RAm", "r@123"));
        users.add(new User(3, "sam", "s@123"));
        return users;
    }

    @PostMapping("/adduser")
    public void adduser(@RequestBody User user) {
        users.add(user);
    }


//    @GetMapping("/getCSRF")
//    public CsrfToken gettoken(HttpServletRequest request) {
//        return (CsrfToken) request.getAttribute("_csrf");
//
//    }


}
