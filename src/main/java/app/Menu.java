package app;
import logic.Lists;
import logic.Logic;
public class Menu {
    public void start() {
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

                default:
                    System.exit(0);
            }
        }
    }
}


