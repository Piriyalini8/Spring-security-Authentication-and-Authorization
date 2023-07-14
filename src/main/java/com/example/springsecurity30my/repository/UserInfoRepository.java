package com.example.springsecurity30my.repository;

import com.example.springsecurity30my.entiry.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String userName);
}
