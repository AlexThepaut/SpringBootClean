package com.example.democleansimple.repository;

import com.example.democleansimple.entity.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<GameUser, Long> {
}
