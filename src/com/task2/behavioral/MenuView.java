package com.task2.behavioral;

public class MenuView {
    public static void displayMenu() {
        for (AppFunctions function : AppFunctions.values()) {
            System.out.println(function);
        }
    }
}
