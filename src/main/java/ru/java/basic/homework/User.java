package ru.java.basic.homework;

public class User {
    public String surname;
    public String name;
    public String otchestvo;
    public Integer yearbirth;
    public String email;

    public User(String surname, String name, String otchestvo, Integer yearbirth, String email) {
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.yearbirth = yearbirth;
        this.email = email;
    }

    public void userPrint() {
        System.out.println("ФИО: " + surname + " " + name + " " + otchestvo);
        System.out.println("Год рождения: " + yearbirth);
        System.out.println("e-mail: " + email);
    }

    public void userPrint40() {
        int age = 2024 - yearbirth;
        if (age > 40) {
            System.out.println("ФИО: " + surname + " " + name + " " + otchestvo);
            System.out.println("Год рождения: " + yearbirth);
            System.out.println("e-mail: " + email);
            System.out.println();
        }
    }
}



