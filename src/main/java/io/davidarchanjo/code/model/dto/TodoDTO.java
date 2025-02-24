package io.davidarchanjo.code.model.dto;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TodoDTO {

    private Long id;
    @NotNull
    private String task;
    @NotNull
    private boolean completed;

}