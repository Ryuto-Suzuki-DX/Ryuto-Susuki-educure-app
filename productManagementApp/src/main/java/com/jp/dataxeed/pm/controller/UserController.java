package com.jp.dataxeed.pm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jp.dataxeed.pm.Form.UserForm;
import com.jp.dataxeed.pm.Form.UserSearchForm;
import com.jp.dataxeed.pm.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/user")
@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showUsers(HttpServletRequest request, Model model) {
        model.addAttribute("currentUri", request.getRequestURI());
        model.addAttribute("searchForm", new UserSearchForm());
        model.addAttribute("users", userService.findAll());
        return "user/users";
    }

    @PostMapping("/searchUser")
    public String searchUser(@ModelAttribute UserSearchForm userSearchForm, Model model, HttpServletRequest request) {
        model.addAttribute("currentUri", request.getRequestURI());
        List<UserForm> users = userService.searchUsers(userSearchForm);
        model.addAttribute("users", users);
        model.addAttribute("searchForm", userSearchForm);
        return "user/users";
    }
}
