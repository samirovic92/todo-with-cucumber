package com.selidrissi.todowithcucumber.infrastructure;

import com.selidrissi.todowithcucumber.domain.Todo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
public class TodoEntity {

    @Id
    private UUID id;
    private String title;

    public TodoEntity() {
    }

    public TodoEntity(UUID id, String title) {
        this.id = id;
        this.title = title;
    }

    public Todo ToDomain() {
        return new Todo(title);
    }
}
