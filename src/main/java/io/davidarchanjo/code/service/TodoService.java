package io.davidarchanjo.code.service;

import java.util.List;

import io.davidarchanjo.code.model.dto.TodoDTO;

public interface TodoService {

    TodoDTO create(TodoDTO dto);
    List<TodoDTO> findAll();
    TodoDTO findById(Long id);
    void update(Long id, TodoDTO dto);
    void delete(Long id);

}