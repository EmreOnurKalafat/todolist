package com.emreonurkalafat.todolist;

import com.emreonurkalafat.todolist.entity.Todo;
import com.emreonurkalafat.todolist.entity.User;
import com.emreonurkalafat.todolist.repository.TodoRepository;
import com.emreonurkalafat.todolist.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TimeZone;

//Spring Security
@SpringBootApplication(exclude = {
		//SecurityAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
@EnableWebSecurity

public class TodolistApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {


		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user =new User();

		user.setPassword("password");
		user.setUsername("Emre");

		Todo todo =new Todo();

		todo.setContent("Cok calıs");
		todo.setDate(LocalDateTime.now());

		user.getTodoList().add(todo);
		todoRepository.save(todo);
		userRepository.save(user);


	}
}
