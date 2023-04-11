package ru.roman;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }


        System.out.println("Задание 2");
        int temperatura = 6;
        if (temperatura > 5) {
            System.out.println("На улице " + temperatura + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatura + " градусов, нужно надеть шапку");
        }


        System.out.println("Задание 3");
        int speed = 80;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        }


        System.out.println("Задание 4");
        int agePerson = 30;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека " + agePerson + " то ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson <= 18) {
            System.out.println("Если возраст человека " + agePerson + " то ему нужно ходить в школу");
        } else if (agePerson > 18 && agePerson <= 24) {
            System.out.println("Если возраст человека " + agePerson + " то ему нужно ходить в университет");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека " + agePerson + " то ему нужно ходить на работу");
        }


        System.out.println("Задание 5");
        int yearsOld = 4;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему нельзя кататься на аттракционе.");
        } else if (yearsOld > 5 && yearsOld < 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему можно кататься на аттракционе в сопровождении.");
        } else if (yearsOld >= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему можно кататься на аттракционе.");
        }


        System.out.println("Задание 6");
        int capasity = 102;
        int sittingCound = 60;
        int standCound = capasity - sittingCound;

        int sittingUsed = 55;
        int standUsed = 42;
        if (sittingUsed < sittingCound) {
            System.out.println("В поезде есть еще " + (sittingCound - sittingUsed) + " сидячих мест");
        }
        if (sittingUsed == sittingCound) {
            System.out.println("В поезде нет сидячих мест!");
        }
        if (standUsed < standCound) {
            System.out.println("В поезде есть еще " + (standCound - standUsed) + " cтоячих мест");
        }
        if (standUsed == standCound) {
            System.out.println("В поезде нет стоячих мест!");
        }


        System.out.println("Задание 7");
        int one = 15;
        int two = 15;
        int three =5;
        if (one > two) {
            if (one > three) {
                System.out.println("Наибольшим числом является " + one);
            } else {
                System.out.println("Наибольшим числом является " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Наибольшим числом является " + two);
            } else{
                System.out.println("Наибольшим числом является " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Наибольшим числом является " + one);
            } else if (three > one) {
                System.out.println("Наибольшим числом является " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}