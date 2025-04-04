Feature: Manage Todo List

  Scenario: Add a new todo item
    Given I have an empty todo list
    When I add a new todo item with the title "Buy groceries"
    Then the todo list should contain 1 item
    And the item should have the title "Buy groceries"

  ##Scenario: Retrieve all todo items
  ##  Given I have a todo list with the following items:
  ##    | title          |
  ##    | Buy groceries  |
  ##    | Walk the dog   |
  ##  When I retrieve all todo items
  ##  Then I should see the following items:
  ##    | title          |
  ##    | Buy groceries  |
  ##    | Walk the dog   |