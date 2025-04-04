package com.selidrissi.todowithcucumber.infrastructure;

import com.selidrissi.todowithcucumber.domain.Todo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TodoAdapterTest {
    @Mock
    private JpaTodoRepository jpaTodoRepository;
    @InjectMocks
    TodoAdapter todoAdapter;

    @Test
    public void should_create_todos() {
        // Given
        var title = "Test Todo";
        var uuid = UUID.randomUUID();
        when(jpaTodoRepository.save(any())).thenReturn(new TodoEntity(uuid, title));

        // When
        var result = todoAdapter.create(title);

        // Then
        assertNotNull(result);
        assertEquals(result.get(0), new Todo(title));
    }

}