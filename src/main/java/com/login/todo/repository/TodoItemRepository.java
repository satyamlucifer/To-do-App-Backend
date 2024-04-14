package com.login.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.todo.modal.TodoItem;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{
    
}
