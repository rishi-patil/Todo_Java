package io.davidarchanjo.code.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String task;
    private boolean completed;

    @Builder
    public Todo(Long id, String task, boolean completed) {
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

}