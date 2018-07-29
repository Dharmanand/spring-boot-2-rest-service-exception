package com.kd.springboot.login.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kd.springboot.login.pojos.Todo;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "Kd Soft", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Kd Soft", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "Kd Soft", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
	
}
