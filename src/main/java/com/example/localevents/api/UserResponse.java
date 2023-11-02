package com.example.localevents.api;

import com.example.localevents.entity.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private String email;
    private String password = null;

    public UserResponse(User user){
        this.email = user.getEmail();
    }
}
