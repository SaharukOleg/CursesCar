package logic;

import user.User;

import java.util.List;
import java.util.Scanner;

public class Logic {

    private Scanner sc = new Scanner(System.in);

    public void addUser(List<User> userList) {
        System.out.println("Enter  first name of user");
        String name = sc.nextLine();

        System.out.println("Введіть last name of user");
        String lastName = sc.nextLine();

        System.out.println("Enter your birthday (yy.mm.dd)");
        String date = sc.nextLine();

        System.out.println("Enter the category of driver's license");
        String categori = sc.nextLine();

        System.out.println("Enter name of city");
        String nameCity = sc.nextLine();

        System.out.println("Enter the gearbox");
        String transmission = sc.nextLine();

        System.out.println("Enter number of phone");
        String phoneNumber = sc.nextLine();
        User user = new User(name, lastName, date, categori, nameCity, transmission, phoneNumber);
        userList.add(user);
    }


    public void show(List<User> userList) {
        userList.forEach(System.out::println);
    }


    public void countStudent(List<User> userList) {

        System.out.println("Count of students -> " + userList.size());
    }


    public void countCity(List<User> userList) {
        System.out.println("Enter the name of the city to show students");
        String nameCity = sc.nextLine();
        int count = 0;

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getCity().equals(nameCity)) {
                count++;
            }

        }
        System.out.println("Count of register students in this city -> " + count);
    }


        public void SearchBySurname (List<User> userList){
            System.out.println("enter last name of student");
            String lastName=sc.nextLine();
            for (int i = 0; i <userList.size() ; i++) {
                if(userList.get(i).getLastname().equals(lastName)){
                    System.out.println(userList.get(i));
                }
                else {
                    System.out.println("sorry but there is no such student");
                }
            }
        }

        public void SearchByTransmission(List<User> userList){
            System.out.println("Enter view Transmission");
            String view=sc.nextLine();
            for (int i = 0; i < userList.size(); i++) {
                if(userList.get(i).getTransmission().equals(view)){
                    System.out.println(userList.get(i));
                }
            }
        }


}
