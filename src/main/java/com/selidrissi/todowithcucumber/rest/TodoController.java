package com.selidrissi.todowithcucumber.rest;

import com.selidrissi.todowithcucumber.domain.Todo;
import com.selidrissi.todowithcucumber.domain.TodoService;
import com.selidrissi.todowithcucumber.domain.TodoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public List<Todo> create(@RequestBody String title) {
        return todoService.create(title);
    }
}
