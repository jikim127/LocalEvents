package com.example.localevents.service;

import com.example.localevents.entity.User;
import com.example.localevents.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApiRestService {

    private final UserRepository userRepository;


//    private String generateDTO(String email, Map<String, Object> jsonMap) {
//        String email = UserDTO.
//        Optional<User> result = userRepository.findByEmail(email).;
//
//    }

}
