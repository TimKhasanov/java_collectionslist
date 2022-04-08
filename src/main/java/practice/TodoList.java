package practice;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist = new ArrayList<>();

    public void add(String todo) {
        todolist.add(todo);
        System.out.println("Добавлено дело: " + todo);

    }

    public void add(int index, String todo) {
        if (index < todolist.size() && index >= 0) {
            todolist.add(index, todo);
            System.out.println("Добавлено дело: " + todo);
        } else {
            todolist.add(todo);

        }

    }

    public void edit(int index, String todo) {
        String docket;
        if (index < todolist.size() && index >= 0) {
            docket = todolist.set(index, todo);
            System.out.println("Дело " + docket + " заменено на " + todo);
        }
    }

    public void delete(int index) {
        String docketDelete;
        if (index < todolist.size() && index >= 0) {
            docketDelete = todolist.remove(index);
            System.out.println("Дело: " + docketDelete + " удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        return todolist;
    }

}
