package app;

public class Menu {
    public void show() {
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
                    registration();
                    break;
                case 2:
                    printRegistration();

                    break;
                case 3:
                    allRegistation();

                    break;
                case 4:
                    allRegistation();

                    break;
                case 5:
                    allRegistation();

                case 6:
                    allRegistation();

                    break;

                default:
                    System.exit(0);
            }
        }
    }

    private void allRegistation() {
    }

    private void printRegistration() {
    }

    private void registration() {
    }
}


