package com.TSI.ITSgame;

import java.util.Scanner;

public class ScannerInputSource implements IInputSource{

    Scanner scanner = new Scanner(System.in);

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}
