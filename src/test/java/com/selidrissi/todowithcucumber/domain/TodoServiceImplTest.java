package com.selidrissi.todowithcucumber.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoServiceImplTest {
    @Mock
    TodoRepository todoRepository;
    @InjectMocks
    TodoServiceImpl todoService;

    @Test
    void should_create_todos() {
        // Given
        String title = "Test Todo";
        when(todoRepository.create(title)).thenReturn(List.of(new Todo(title)));

        // When
        var result = todoService.create(title);

        // Then
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(title, result.get(0).title());
    }

}