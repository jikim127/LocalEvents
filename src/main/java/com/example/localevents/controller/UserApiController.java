package com.example.localevents.controller;

import com.example.localevents.dto.AddUserRequest;
import com.example.localevents.service.SecurityUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final SecurityUserService SecurityUserService;

    @PostMapping("/user")
    public String signup(AddUserRequest request){
        SecurityUserService.save(request);
        return "redirect:/login";
    }

}
