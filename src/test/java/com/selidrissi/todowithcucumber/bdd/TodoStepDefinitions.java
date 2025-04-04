package com.selidrissi.todowithcucumber.bdd;

import com.selidrissi.todowithcucumber.domain.Todo;
import com.selidrissi.todowithcucumber.domain.TodoRepository;
import com.selidrissi.todowithcucumber.domain.TodoService;
import com.selidrissi.todowithcucumber.domain.TodoServiceImpl;
import com.selidrissi.todowithcucumber.infrastructure.JpaTodoRepository;
import com.selidrissi.todowithcucumber.infrastructure.JpaTodoRepositoryStub;
import com.selidrissi.todowithcucumber.infrastructure.TodoAdapter;
import com.selidrissi.todowithcucumber.rest.TodoController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TodoStepDefinitions extends AbstractStepDefinitions {
    private List<Todo> todos = new ArrayList<>();

    @Given("I have an empty todo list")
    public void createEmptyTodoList() {
        // Implementation here
    }

    @When("I add a new todo item with the title {string}")
    public void iAddANewTodoItemWithTheTitle(String title) {
        System.out.println(title);
        todos = todoController.create(title);
    }

    @Then("the todo list should contain {int} item")
    public void theTodoListShouldContainItem(int total) {
        assertThat(todos.size()).isEqualTo(total);
    }

    @And("the item should have the title {string}")
    public void theItemShouldHaveTheTitle(String title) {
        assertThat(todos.stream().findFirst().get().title()).isEqualTo(title);
    }
}
