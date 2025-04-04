package com.selidrissi.todowithcucumber.infrastructure;

import com.selidrissi.todowithcucumber.domain.Todo;
import com.selidrissi.todowithcucumber.domain.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class TodoAdapter implements TodoRepository {
    private final JpaTodoRepository jpaTodoRepository;

    public TodoAdapter(JpaTodoRepository jpaTodoRepository) {
        this.jpaTodoRepository = jpaTodoRepository;
    }

    @Override
    public List<Todo> create(String title) {
        var todoId = UUID.randomUUID();
        TodoEntity todoEntity = jpaTodoRepository.save(new TodoEntity(todoId, title));
        return List.of(todoEntity.ToDomain());
    }
}
