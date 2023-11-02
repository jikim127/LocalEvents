package com.example.localevents.repository;

import com.example.localevents.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    User save(User user);
//    Optional<User> findById(Long idNo);
//    Optional<User> findByName(String id);
//    List<User> findAll();

    Optional<User> findByEmail(String email); // email로 사용자 정보 가져옴

//    @EntityGraph(attributePaths = "roleSet")
//    @Query("select u from User u where u.id = :id and u.social = false ")
//    Optional<User> getWithRoles(String username);
}
