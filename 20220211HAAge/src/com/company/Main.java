package com.company;

public class Main {
/* напечатать имена и возраст для персон старше заданного возраста*/
    public static void main(String[] args) {
        String[] names = {"Olga", "Inna", "Natalie", "Julia", "Anna"};
        int[] birthdays = {1999, 2002, 1972, 2011, 2001};
        int age = 20;
        ageMore(names, birthdays, age);
    }

    public static void ageMore(String[] names, int[] birthdays, int age) {
        System.out.println("Имя и возраст людей старше " + age + " лет : ");
        for (int i = 0; i<names.length; i++){
            if (2022 - birthdays[i] > age) {
                int agePerson=2022 - birthdays[i];
                System.out.println(names[i]+ " " + agePerson + " years");
            }
        }
    }

}
