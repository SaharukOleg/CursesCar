package logic;


import user.User;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static logic.Lists.userList;

public class Logic {

    private Scanner sc = new Scanner(System.in);

    public void addUser(List<User> userList) {
        System.out.println("Enter  first name of user");
        String name = sc.nextLine();
        System.out.println("Enter last name of user");
        String lastName = sc.nextLine();
        System.out.println("Enter your birthday (yy.mm.dd)");
        String date = sc.nextLine();
        System.out.println("Enter the category of driver's license");
        String category = sc.nextLine();
        System.out.println("Enter name of city");
        String nameCity = sc.nextLine();
        System.out.println("Enter the gearbox");
        String transmission = sc.nextLine();
        System.out.println("Enter number of phone");
        String phoneNumber = sc.nextLine();
        User user = new User(name, lastName, date, category, nameCity, transmission, phoneNumber);
        userList.add(user);
    }


    public void print() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void countStudent(List<User> userList) {

        System.out.println("Count of students - " + userList.size());
    }

    public void countCity(List<User> userList) {
        System.out.println("Enter the name of the city to show students");
        String nameCity = sc.nextLine();
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getCity().equals(nameCity)) {
                System.out.println(user);
            }
            else {
                System.out.println("sorry but there is no such student");
            }
        }

    }

    public void searchByLastName(List<User> userList) {
        System.out.println("enter last name of student");
        String lastName = sc.nextLine();
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getLastname().equals(lastName)) {
                System.out.println(user);
            }
            else {
                System.out.println("sorry but there is no such student");
            }
        }
    }

    public void searchByTransmission(List<User> userList) {
        System.out.println("Enter view Transmission");
        String view = sc.nextLine();
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getTransmission().equals(view)) {
                System.out.println(user);

            }
        }
    }


}





