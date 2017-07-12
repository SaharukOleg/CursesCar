package app;

import app.shared.Shared;
import com.sun.tools.javah.Util;
import logic.Logic;


public class Menu {
    public void show() {
        Logic logic = new Logic();

        while (true) {
            System.out.println(">1 Register");
            System.out.println(">2 Show all  register students");
            System.out.println(">3 General number of register students");
            System.out.println(">4 General number of register students in city");
            System.out.println(">5 Search by surname");
            System.out.println(">6 Search by transmission");
            System.out.println(">7 Exit");

            switch (PrintScanner.getIntNumber()) {
                case 1:
                    logic.addUser(Shared.userList);
                    break;
                case 2:
                    logic.show(Shared.userList);
                    break;
                case 3:
                    logic.countStudent(Shared.userList);
                    break;
                case 4:
                    logic.countCity(Shared.userList);
                    break;
                case 5:
                    logic.SearchBySurname(Shared.userList);
                    break;
                case 6:
                    logic.SearchByTransmission(Shared.userList);
                    break;
                case 7:
                    default:
                        System.exit(0);
            }
        }
    }
}


