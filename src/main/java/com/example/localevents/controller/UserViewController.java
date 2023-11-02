package com.example.localevents.controller;

import com.example.localevents.api.UserResponse;
import com.example.localevents.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserViewController {

    @GetMapping("/index")
    public String index(Model model, @AuthenticationPrincipal User userInfo) throws Exception {
        UserResponse userResponse = new UserResponse(userInfo);
        model.addAttribute("userInfo", userResponse);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request,response,
                SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
