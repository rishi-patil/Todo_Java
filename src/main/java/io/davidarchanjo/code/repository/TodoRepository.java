package io.davidarchanjo.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.davidarchanjo.code.model.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
