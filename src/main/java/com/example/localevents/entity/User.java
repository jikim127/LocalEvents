package com.example.localevents.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    private String name;

    @Builder
    public User(String email, String password, String auth){
        this.email = email;
        this.password = password;
    }

    @Override // 권한 반환
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }

    @Override // 사용자의 id 반환(고유한 값)
    public String getUsername(){
        return email;
    }

    @Override // 사용자의 패스워드 반환
    public String getPassword(){
        return password;
    }

    @Override // 계정 만료 여부 반환
    public boolean isAccountNonExpired() {
        return true; // true : 만료 X
    }

    @Override // 계정 잠금 여부 반환
    public  boolean isAccountNonLocked() {
        return true; // true : 잠금 X
    }

    @Override // 패스워드 만료 여부 반환
    public boolean isCredentialsNonExpired(){
        return true; // ture : 만료 X
    }

    @Override // 계정 사용 가능 여부 반환
    public boolean isEnabled() {
        return true; // true : 사용 가능
    }
//
//    public Long getIdNo() {
//    }
}
