package com.selidrissi.todowithcucumber.domain;

import java.util.List;

public interface TodoRepository {
    List<Todo> create(String title);
}
