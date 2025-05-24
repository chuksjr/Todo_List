package br.com.chuksricardo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chuksricardo.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
  
}
