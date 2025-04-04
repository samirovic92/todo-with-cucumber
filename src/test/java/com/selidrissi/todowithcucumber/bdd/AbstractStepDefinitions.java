package com.selidrissi.todowithcucumber.bdd;

import com.selidrissi.todowithcucumber.domain.TodoRepository;
import com.selidrissi.todowithcucumber.domain.TodoService;
import com.selidrissi.todowithcucumber.domain.TodoServiceImpl;
import com.selidrissi.todowithcucumber.infrastructure.JpaTodoRepository;
import com.selidrissi.todowithcucumber.infrastructure.JpaTodoRepositoryStub;
import com.selidrissi.todowithcucumber.infrastructure.TodoAdapter;
import com.selidrissi.todowithcucumber.rest.TodoController;

public class AbstractStepDefinitions {

    protected JpaTodoRepository jpaTodoRepository = new JpaTodoRepositoryStub();
    protected TodoRepository todoRepository = new TodoAdapter(jpaTodoRepository);
    protected TodoService todoService = new TodoServiceImpl(todoRepository);
    protected TodoController todoController = new TodoController(todoService);

}
