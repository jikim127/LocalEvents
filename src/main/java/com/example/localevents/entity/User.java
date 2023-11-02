package com.example.localevents.entity;


import com.example.localevents.constant.Role;
import com.example.localevents.dto.MemberFormDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;


@Entity
@Getter @Setter @ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    private String password;

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static User createUser(MemberFormDTO memberFormDTO,
                                  PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setEmail(memberFormDTO.getEmail());
        String password = passwordEncoder.encode(memberFormDTO.getPassword());
        user.setName(memberFormDTO.getName());
        user.setRole(Role.USER);
        return user;
    }

}
