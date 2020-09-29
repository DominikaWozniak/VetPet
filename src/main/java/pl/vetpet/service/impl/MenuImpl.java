package pl.vetpet.service.impl;

import pl.vetpet.model.UserDetails;
import pl.vetpet.service.MenuService;
import pl.vetpet.service.UserService;

import java.util.Scanner;

public class MenuImpl implements MenuService {

    private Scanner scanner;
    private UserService userService;
    private UserDetails userDetails;

    public MenuImpl(){
        scanner = new Scanner(System.in);
        userService = new UserServiceImpl();
        userDetails = new UserDetails();
    }

    @Override
    public void mainMenu() {
        System.out.println("1. Zaloguj \n" +
                            "2. Zarejestruj \n" +
                            "3. Wyjdź z programu.");

        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                //userService.userLogIn();
                break;
            case "2":
                userService.createNewUser(userDetails);
                break;
            case "3":
                System.out.println("Zakończono program.");
                break;
            default:
                System.out.println("Nieznane polecenie.");
                mainMenu();
                break;
        }

    }

    @Override
    public void adminMenu() {

    }

    @Override
    public void vetMenu() {

    }

    @Override
    public void accountantMenu() {

    }


}
