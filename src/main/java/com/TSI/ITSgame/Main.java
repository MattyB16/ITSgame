package com.TSI.ITSgame;

public class Main {

    public static void main(String args[]){

        IInputSource input = new ScannerInputSource();
        System.out.println("Enter Name: ");
        String characterName = input.nextLine().toLowerCase();

        Character player = new Character(6,6,characterName);

        Game game = new Game(player);
        game.gameRun(input);


    }


}
