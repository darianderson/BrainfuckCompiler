package com.brainfuck;

public class Point extends Command {

    char command = '.';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        int index  = getIndex();
        byte[] array = getArray();
        System.out.print((char)array[index]);
        increaseLineIndex();
    }
}
