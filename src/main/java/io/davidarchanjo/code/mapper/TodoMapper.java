package io.davidarchanjo.code.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.davidarchanjo.code.model.domain.Todo;
import io.davidarchanjo.code.model.dto.TodoDTO;

@Component
public class TodoMapper {
    
    @Autowired
    private ModelMapper modelMapper;

    public Todo build(TodoDTO dto) {
        return Todo.builder()
            .id(dto.getId())
            .task(dto.getTask())
            .completed(dto.isCompleted())
            .build();
    }

    public TodoDTO build(Todo domain) {
        return TodoDTO.builder()
            .id(domain.getId())
            .task(domain.getTask())
            .completed(domain.isCompleted())
            .build();
    }

    public Todo build(TodoDTO dto, Todo domain) {
        modelMapper.map(dto, domain);
        return domain;
    }

}