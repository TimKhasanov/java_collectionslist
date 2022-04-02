package practice;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> todolist = new ArrayList<>();

    public void add(String todo) {
        todolist.add(todo);
        // TODO:добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index < todolist.size() && index >= 0) {
            todolist.add(index, todo);
        } else {
            todolist.add(todo);
        }

        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index < todolist.size() && index > 0) {
            todolist.set(index, todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index < todolist.size() && index > 0) {
            todolist.remove(index);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        return todolist;
    }

}
