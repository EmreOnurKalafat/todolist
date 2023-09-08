package com.emreonurkalafat.todolist.controller;

import com.emreonurkalafat.todolist.entity.Todo;
import com.emreonurkalafat.todolist.entity.User;
import com.emreonurkalafat.todolist.repository.TodoRepository;
import com.emreonurkalafat.todolist.repository.UserRepository;
import com.emreonurkalafat.todolist.request.AddTodoRequest;
import com.emreonurkalafat.todolist.request.AddUserRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "https://localhost:4444")
public class UserController {
    private  UserRepository userRepository;
    private  TodoRepository todoRepository;

    public UserController(UserRepository userRepository, TodoRepository todoRepository) {
        this.userRepository = userRepository;
        this.todoRepository = todoRepository;
    }
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new NoSuchElementException("User with ID " + userId + " not found."));
    }

    @PostMapping
    public User addUser(@RequestBody AddUserRequest userRequest){
        User user= new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        return  userRepository.save(user);
    }

    @PostMapping("/{userId}/todos")
    public void addTodo(@PathVariable Long userId, @RequestBody AddTodoRequest todoRequest){
        User user=userRepository.findById(userId).orElseThrow(()->new NoSuchElementException());
        Todo todo =new Todo();
        todo.setContent(todoRequest.getContent());
        todo.setDate(todoRequest.getDate());
        user.getTodoList().add(todo);
        todoRepository.save(todo);
        userRepository.save(user);
    }

    @PostMapping("/todos/{todoId}")
    public void toggleTodoCompleted(@PathVariable Long todoId){
        Todo todo= todoRepository.findById(todoId).orElseThrow(()-> new NoSuchElementException());
        todo.setCompleted(!todo.getCompleted());
        todoRepository.save(todo);
    }

    @DeleteMapping("{userId}/todos/{todoId}")
    public void deleteTodo(@PathVariable Long userId,@PathVariable Long todoId){
        User user=userRepository.findById(userId).orElseThrow(()-> new NoSuchElementException());
        Todo todo=todoRepository.findById(todoId).orElseThrow(()-> new NoSuchElementException());
        user.getTodoList().remove(todo);
        todoRepository.delete(todo);
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        User user= userRepository.findById(userId).orElseThrow(()-> new NoSuchElementException());
        userRepository.delete(user);
    }
}
