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

                    break;
                case 2:

                    break;
                case 3:

                    break;

                default:
                    System.exit(0);
            }
        }
    }
}


