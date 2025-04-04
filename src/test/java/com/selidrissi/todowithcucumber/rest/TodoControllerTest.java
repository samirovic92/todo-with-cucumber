package com.selidrissi.todowithcucumber.rest;

import com.selidrissi.todowithcucumber.domain.Todo;
import com.selidrissi.todowithcucumber.domain.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoControllerTest {
    @InjectMocks
    TodoController todoController;
    @Mock
    TodoService todoService;

    @Test
    public void should_create_todo() {
        // Given
        String title = "Test Todo";
        when(todoService.create(title)).thenReturn(List.of(new Todo(title)));

        // When
        var result = todoController.create(title);

        // Then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(title, result.get(0).title());
    }
}