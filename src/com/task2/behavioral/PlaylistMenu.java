package com.task2.behavioral;

import com.task2.structural.Inputer;

public class PlaylistMenu extends AbstractMenu {
    private static PlaylistMenu instance;

    public PlaylistMenu() {
        super();
    }

    public static PlaylistMenu getPlaylistMenu() {
        if (instance == null) {
            instance = new PlaylistMenu();
        }
        return instance;
    }

    @Override
    public void displayMenu() {
        for (int i = 1; i < MenuAction.values().length; i++) {
            System.out.println((i) + ". " + MenuAction.values()[i]);
        }
        System.out.println("0. Выход");
    }

    public void execute() {
        while (true) {
            displayMenu();
            int choice = Inputer.readInt("Выберите действие: ");
            MenuAction.execute(choice, this);
            if (choice == 0) {
                break;
            }
        }
    }
}
