package com.selidrissi.todowithcucumber.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaTodoRepository extends JpaRepository<TodoEntity, UUID> {

}
