package com.emreonurkalafat.todolist.repository;

import com.emreonurkalafat.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}

