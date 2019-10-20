package com.brainfuck;

public class Plus extends Command {

    char command = '+';

    public char getCommand() {
        return command;
    }

    @Override
    public void implementation() {
        int index = getIndex();
        byte[] array = getArray();
        setElement(++array[index]);
    }
}
