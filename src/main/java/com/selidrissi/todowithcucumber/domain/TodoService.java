package com.selidrissi.todowithcucumber.domain;

import java.util.List;

public interface TodoService {
    List<Todo> create(String title);
}
