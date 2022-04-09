package practice;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String regexAdd = "(?i)(Add)\\s\\w.+";
        String regexAddIndex = "(?i)(Add)\\s\\d+\\s\\w.+";
        String regexList = "(?i)(List)";
        String regexEdit = "(?i)(Edit)\\s\\d+\\s\\w.+";
        String regexDelete = "(?i)(Delete)\\s\\d+";
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regexAddIndex)) {
                String[] data1 = input.split(" ", 3);
                int indexAdd = Integer.parseInt(data1[1]);
                todoList.add(indexAdd, data1[2]);

            } else if (input.matches(regexAdd)) {
                String[] data2 = input.split(" ", 2);
                todoList.add(data2[1]);

            } else if (input.matches(regexList)) {
                for (int i = 0; i < todoList.getTodos().size(); i++) {
                    System.out.println(i + " - " + todoList.getTodos().get(i));
                }

            } else if (input.matches(regexEdit)) {
                String[] data3 = input.split(" ", 3);
                int indexEdit = Integer.parseInt(data3[1]);
                todoList.edit(indexEdit, data3[2]);

            } else if (input.matches(regexDelete)) {
                String[] data4 = input.split(" ", 2);
                int indexDelete = Integer.parseInt(data4[1]);
                todoList.delete(indexDelete);
            }

        }
    }
}
