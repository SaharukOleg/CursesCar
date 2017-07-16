package app;
import logic.Logic;
import logic.Lists;
public class Menu {
    public void start() {
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
                    logic.addUser(Lists.userList);

                    break;
                case 2:
                    logic.print();

                    break;
                case 3:
                    logic.countStudent(Lists.userList);

                    break;
                case 4:
                    logic.countCity(Lists.userList);

                    break;
                case 5:
                    logic.searchByLastName(Lists.userList);

                    break;
                case 6:
                    logic.searchByTransmission(Lists.userList);
                    break;
                case 7:
                    default:
                        System.exit(0);
            }
        }
    }
}


