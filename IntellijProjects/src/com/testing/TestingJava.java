package com.testing;

import java.util.ArrayList;
import java.util.Scanner;

public class TestingJava {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, write something: ");
        String received = keyboard.nextLine();

        System.out.println("This is what we received: "+received);

        System.out.println("This PC can handle some array manipulation ?\nLet's check it out !");

        ArrayList<Integer> intArray = new ArrayList<>();

        intArray.add(20);
        intArray.add(30);
        intArray.add(40);

        //For Each Method -  forEach((number) -> System.out.println(number))
        intArray.forEach(System.out::println);
    }
}
