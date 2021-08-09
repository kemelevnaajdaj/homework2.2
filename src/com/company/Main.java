package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(resultStroke(45, 23));
        System.out.println(resultStroke(52, 32));
        System.out.println(resultStroke(85, 12));

        System.out.println(resultStroke(12, 23));
        System.out.println(resultStroke(56, 42));

        System.out.println(resultStroke(generateRandomAge(), 23));

        System.out.println(generateRandomAge());
        System.out.println(generateRandomAge());
    }

    public static String resultStroke(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return " Можно идти гулять1 " + age;
        } else if (age < 20 && temp > 0 && temp < 28)
            return " Можно идти гулять2 "+ age;
        else if (age > 45 && temp > -10 && temp < 25)
            return " Можно идти гулять3 " + age;
        else return "Оставайтесь дома " + age;
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);
    }

}
