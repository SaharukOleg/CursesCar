package logic;


import user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logic {

    private Scanner sc = new Scanner(System.in);

    public static List<User> userList = new ArrayList<>();

    public void addUser() {
        System.out.println("Enter  first name of user");
        String name = sc.nextLine();
        System.out.println("Введіть last name of user");
        String lastName = sc.nextLine();
        System.out.println("Рік народження,місяць,дата");
        String date = sc.nextLine();
        System.out.println("Enter name of city");
        String nameCity = sc.nextLine();
        System.out.println("Коробка автомат чи механіка");
        String transmission = sc.nextLine();
        System.out.println("номер телефону");
        String phoneNumber = sc.nextLine();
        User user = new User(name, lastName, date, nameCity, transmission, phoneNumber);
        userList.add(user);
    }
}
