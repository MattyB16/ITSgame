package com.TSI.ITSgame;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        System.out.println("Welcome to Journey to Alejandro's sisters room!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String name = scanner.next();

        Character Player = new Character(name);




    }


}
