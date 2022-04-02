package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        String deals;
        String nameOfDeals;
        String regex = "ADD";
        String regex2 ="LIST";



        Scanner scanner = new Scanner(System.in);
        deals = scanner.nextLine();
        if(deals.equals(regex)){
            nameOfDeals = scanner.nextLine();
            todoList.add(nameOfDeals);
            System.out.println("Добавлено дело "+ todoList.getTodos());
        }
        else if (deals.equals(regex2)){
            System.out.println(todoList.getTodos());

        }

        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
