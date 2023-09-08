package com.emreonurkalafat.todolist.repository;

import com.emreonurkalafat.todolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

