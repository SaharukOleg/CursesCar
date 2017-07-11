package app;

import app.shared.Shared;
import logic.Logic;

import java.util.Locale;

public class Menu {
    public void show() {
        Logic logic = new Logic();

        while (true) {
            System.out.println(">1 Зарейструватися");
            System.out.println(">2 Вивести зарейстрованих студентів");
            System.out.println(">3 Загальна кількість зарейстрованих");
            System.out.println(">4 Загальна кількість зарейстрованих по місту");
            System.out.println(">5 Пошук по прізвищу");
            System.out.println(">6 Пошук по коробках передач");
            System.out.println(">7 Вийти");

            switch (PrintScanner.getIntNumber()) {
                case 1:

                    logic.addUser();
                    break;
                case 2:
                    logic.show(Shared.userList);

                    break;
                case 3:
                    logic.show(Shared.userList);

                    break;
                case 4:


                    break;
                case 5:


                case 6:


                    break;

                default:
                    System.exit(0);
            }
        }
    }
}


