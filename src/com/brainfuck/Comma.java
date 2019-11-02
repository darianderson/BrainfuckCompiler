package com.brainfuck;

import java.util.Scanner;

public class Comma extends Command {

    char command = ',';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        Scanner ob = new Scanner(System.in);
        int index = getIndex();
        byte[] array = getArray();
        array[index] =(byte) ob.next().charAt(0);
        increaseLineIndex();
    }
}
